/*******************************************************************
 이  름 : rx232 통신 함수
 작성자 : 장길석
 버  전 : 0.0.2
 참  고 :

 버  전:
         0.0.1  - udpip.c 0.0.1 를 수정
         0.0.2  - poll_loop 에서 객체의 생성 유무 확인 if 추가

********************************************************************/
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>
#include <string.h>
#include <sys/poll.h>
#include <sys/time.h>
#include <sys/socket.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include "netinc.h"
#include "pollmanager.h"

typedef struct pollfd pollfd_t;

pollfd_t    poll_array[POLL_MAX_COUNT];                               // poll 배열
net_obj_t  *poll_objs[POLL_MAX_COUNT];                                // poll 에 해당되는 object

//--------------------------------------------------------------------
// 설명: poll 메니저를 초기화
//--------------------------------------------------------------------
void  poll_init( void)
{
  int   ndx;
                                  // poll array 를 초기화 한다.
                                  // pollfd 구조체의 모든 fd 를 -1 로 초기화 한다.
                                  // fd 가 -1 이면 파일지시자가 세팅되어있지 않다는 뜻이다.

  for ( ndx = 0; ndx < POLL_MAX_COUNT; ndx++)
  {
    poll_array[ndx].fd  = -1;
    poll_objs[ndx]      = NULL;
  }
}

//--------------------------------------------------------------------
// 설명: poll 메니저에서 비어 있는 인덱스 번호를 구한다.
// 반환: 배열 중 등록되지 않은 인덱스 번호
//--------------------------------------------------------------------
int poll_blank_ndx( void)
{
  int poll_ndx;
  int ndx;

                                  // poll array 에서 디스크립터가 -1 인 아이템은
                                  // poll 검색에서 사용하지 않는 아이템이다.
                                  // 비어 있는 배열의 인덱스를 검색한다.

  poll_ndx  = -1;
  for ( ndx = 0; ndx < POLL_MAX_COUNT; ndx++)
  {
    if ( -1 == poll_array[ndx].fd)
    {
      poll_ndx  = ndx;                                                // 비어 있는  array 를 찾음
      break;
    }
  }
  return poll_ndx;
}

//--------------------------------------------------------------------
// 설명: poll 메니저에 net_obj 를 등록
//--------------------------------------------------------------------
int poll_register( net_obj_t *_obj)
{
  int poll_ndx;

                                  // 비어 있는 poll array 를 찾아 소켓을 등록한다.
                                  // poll array 에 등록할 수 있는 인덱스가 있을 경우
                                  // poll_ndx 가 0 이상의 값이된다.

  poll_ndx  = poll_blank_ndx();

  if ( 0 <= poll_ndx)                                                 // 등록할 수 있는 poll array 를 찾았음
  {
    _obj->poll_ndx                = poll_ndx;                         // socket 정보에 폴 정보를 등록
    poll_array[poll_ndx].fd       = _obj->fd;                         // poll 에 디스크립터를 등록한다.
    poll_array[poll_ndx].events   = POLLIN | POLLERR | POLLHUP;       // POLLOUT 은 poll_change_event() 에서 변경 사용
    poll_array[poll_ndx].revents  = 0;
    poll_objs[poll_ndx]           = _obj;
  }
  return poll_ndx;
}

//--------------------------------------------------------------------
// 설명: poll 메니저의 net_obj 를 소멸
//--------------------------------------------------------------------
void poll_unregister( net_obj_t *_obj)
{
  poll_array[_obj->poll_ndx].fd = -1;                                 // poll array 의 배열을 blank 로 지정
  poll_objs[_obj->poll_ndx]     = NULL;                               // poll array 에 해당되는 obj 정보를 삭제
}

//--------------------------------------------------------------------
// 설명: poll 메니저의 최대 운영 객체 개수
// 반환: 최대 객체 개수
//--------------------------------------------------------------------
int poll_count( void)
{
  return  POLL_MAX_COUNT;
}

//--------------------------------------------------------------------
// 설명: poll 메니저에 등록된 net_obj 를 반환
// 인수: _ndx   : 인덱스 번호
// 반환: net_obj_t
//--------------------------------------------------------------------
net_obj_t *poll_obj( int _ndx)
{
  return  poll_objs[_ndx];
}

//--------------------------------------------------------------------
// 설명: poll 메니저에 등록된 디스크립터에서 인덱스 번호에 해당하는
//       디스크립터를 반환한다.
// 인수: _ndx   : 인덱스 번호
// 반환: 디스크립터
//--------------------------------------------------------------------
int poll_get_fd( int _ndx)
{
  return  poll_array[_ndx].fd;
}

//--------------------------------------------------------------------
// 설명: poll 메니저에 등록된 디스크립터에서 인덱스 번호에 대한
//       디스크립터를 지정한다.
// 인수: _ndx   : 인덱스 번호
//       _fd    : 디스크립터
//--------------------------------------------------------------------
void poll_set_fd( int _ndx, int _fd)
{
  poll_array[_ndx].fd = _fd;
}

//--------------------------------------------------------------------
// 설명: 선택한 소켓에 대한 확인하는 이벤트 종류를 다시 설정한다.
// 인수: _fd    : 소켓의 디스크립터
//       _event : 변경하려는 이벤트 모음
// 반환: 0                  : 에러 없음
//       POLL_NO_DESCRIPTOR : 인수로 받은 디스크립터가 poll 메니저에
//                            등록되어 있지 않음
//--------------------------------------------------------------------
int poll_change_event( int _fd, int _event)
{
  int   ndx;

  for( ndx = 0; ndx < POLL_MAX_COUNT; ndx++ )                         
  {
    if ( _fd == poll_array[ndx].fd)
    {
      poll_array[ndx].events  = _event;
      return 0;
    }
  }
  return POLL_NO_DESCRIPTOR;
}

//--------------------------------------------------------------------
// 설명: poll 관리자 루프
// 반환: POLL_BIG_ERR   - 치명적인 에러가 발생
//       POLL_TIME_OUT  - 지정된 시간내에 이벤트가 발생하지 않았음
//       POLL_EVENTED   - 특정 이벤트가 발생했음
//--------------------------------------------------------------------
int poll_loop( int _time_out)
{
  int     poll_state;
  int     ndx;

  poll_state = poll( (struct pollfd *)&poll_array, POLL_MAX_COUNT, _time_out);
  if ( 0 > poll_state)
  {                                                                   // 치명적인 에러가 발생했다.
    return POLL_BIG_ERR;
  }
  if ( 0 == poll_state)                                               // 타임아웃에 걸렸으므로
  {                                                                   // 다시 상태를 확인한다.
    return POLL_TIME_OUT;
  }
  for( ndx = 0; ndx < POLL_MAX_COUNT; ndx++ )      
  {
    if( poll_array[ndx].revents & POLLIN )                            // 상대로부터 자료가 수신되었음
    {
      if ( NULL != poll_objs[ndx])
      {
        poll_objs[ndx]->on_poll_in( poll_objs[ndx]);
      }
    }
    if( poll_array[ndx].revents & POLLOUT )                           // 쓰기 상태가 block 이 아님
    {
      if ( NULL != poll_objs[ndx])
      {
        poll_objs[ndx]->on_poll_out( poll_objs[ndx]);
      }
    }
    if( poll_array[ndx].revents & POLLERR )                           // 에러가 발생
    {
      if ( NULL != poll_objs[ndx])
      {
        poll_objs[ndx]->on_poll_err( poll_objs[ndx]);
      }
    }
    if( poll_array[ndx].revents & POLLHUP )                           // 라인이 끝어 졌다면
    {
      if ( NULL != poll_objs[ndx])
      {
        poll_objs[ndx]->on_poll_hup( poll_objs[ndx]);
      }
    }
  }
  return  POLL_EVENTED;
}
