/*******************************************************************
 이  름 : rs232 통신 함수
 작성자 : 장길석
 버  전 : 0.0.3
 참  고 :

 버  전:
         0.0.1  - udpip.c 0.0.1 를 수정
         0.0.2  - 임시 버퍼를 netinc.h 로 이동
         0.0.3  - rx232 에서 rs232 로 수정

********************************************************************/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h>
#include <termios.h>        // B115200, CS8 등 상수 정의
#include <fcntl.h>          // O_RDWR , O_NOCTTY 등의 상수 정의


#include "netinc.h"
#include "pollmanager.h"
#include "rs232.h"

static void on_rs232_poll_in( rs232_t *sender);
static void on_rs232_poll_out( rs232_t *sender);
static void on_rs232_poll_err( rs232_t *sender);
static void on_rs232_poll_hup( rs232_t *sender);

//--------------------------------------------------------------------
// 설명: 새로운 소켓을 생성한다.
// 반환: NULL = 소켓 생성 실패
//       else   소켓 메모리 포인터
//--------------------------------------------------------------------
static rs232_t *new_socket( void)
{
  rs232_t *sock;

  sock  = (rs232_t *)malloc( sizeof( rs232_t));
  if ( NULL != sock)
  {
    sock->fd              = -1;
    sock->tag             = 0;
    sock->type            = STYP_RS232;
    sock->on_poll_in      = on_rs232_poll_in;
    sock->on_poll_out     = on_rs232_poll_out;
    sock->on_poll_err     = on_rs232_poll_err;
    sock->on_poll_hup     = on_rs232_poll_hup;
    sock->on_read         = NULL;
    sock->on_writable     = NULL;
  }
  return  sock;
}

//--------------------------------------------------------------------
// 설명: 소켓을 open 한다.
// 인수: _sock      - 소켓 정보
// 반환: 0 = 에러 없음
//       0 > 에러 발생
//--------------------------------------------------------------------
static int socket_open( rs232_t *_sock)
{
  struct termios   newtio;

  _sock->fd = open(_sock->devname, O_RDWR | O_NOCTTY | O_NONBLOCK );        // 디바이스를 open 한다.

  if ( 0 > _sock->fd)
  {
    return NERR_NOT_OPENED;
  }

  memset( &newtio, 0, sizeof(newtio) );

                                  // 통신 baud 설정

  switch(_sock->baud )
  {
  case 2400   : newtio.c_cflag = B2400  ; break;
  case 4800   : newtio.c_cflag = B4800  ; break;
  case 9600   : newtio.c_cflag = B9600  ; break;
  case 19200  : newtio.c_cflag = B19200 ; break;
  case 38400  : newtio.c_cflag = B38400 ; break;
  case 57600  : newtio.c_cflag = B57600 ; break;
  default     : newtio.c_cflag = B115200; break;                      // default 는 115200
  }
                                  // data bits 설정

  switch(_sock->databit)
  {
  case 5  : newtio.c_cflag |= CS5; break;
  case 6  : newtio.c_cflag |= CS6; break;
  case 7  : newtio.c_cflag |= CS7; break;
  default : newtio.c_cflag |= CS8;                                    // default 는 8 bit
  }

                                  // stop bit 설정

  if ( 2 == _sock->stopbit)
  {
    newtio.c_cflag |= RS_2_STOP_BIT;
  }

  newtio.c_cflag |= CLOCAL | CREAD;                                   // CRTSCTS 제외

                                  // parity 설정

  switch(_sock->parity | 0x20 )                                       // | 0x20 대문자 값이라도 소문자로
  {
  case 'o'  : newtio.c_cflag |= RS_ODD_PARITY;   break;
  case 'e'  : newtio.c_cflag |= RS_EVEN_PARITY;  break;
  }

  newtio.c_oflag      = 0;
  newtio.c_lflag      = 0;
  newtio.c_cc[VTIME]  = 0;                                            // time-out 값으로 사용된다. time-out 값은 TIME*0.1초 이다.
  newtio.c_cc[VMIN]   = 1;                                            // MIN은 read가 리턴되기 위한 최소한의 문자 개수

  tcflush  (_sock->fd, TCIFLUSH );
  tcsetattr(_sock->fd, TCSANOW, &newtio );

  return NERR_NONE;
}

//--------------------------------------------------------------------
// 설명: 소켓을 close 한다.
// 인수: _sock      - 소켓 정보
//--------------------------------------------------------------------
static void  socket_close( rs232_t *_sock)
{
  close(_sock->fd);
  _sock->fd       = -1;
}

//--------------------------------------------------------------------
// 설명: fd 에 해당하는 poll 의 index 를 구한다.
// 인수: _fd  - 검색하려는 파일 디스크립터
// 반환  0 <= - 찾은 poll 의 index
//       0 >  - poll index 를 찾지 못했음
//--------------------------------------------------------------------
static int  socket_get_poll_ndx( int _fd)
{
  int     cnt_objs;
  int     ndx;

  cnt_objs = poll_count();

  for ( ndx = 0; ndx < cnt_objs; ndx++)
  {
    if ( _fd == poll_get_fd(ndx))
    {
      return ndx;
    }
  }
  return  -1;
}

static int socket_reopen( rs232_t *_sock)
{
  int   ndx_poll;
  int   reopen_ok;

  ndx_poll = socket_get_poll_ndx( _sock->fd);
  socket_close( _sock);
  reopen_ok = socket_open( _sock);
  if ( NERR_NONE == reopen_ok)
  {
    poll_set_fd( ndx_poll, _sock->fd);
  }
  return NERR_NONE == reopen_ok;
}

////////////////////////////////////////////////////////////////////// 내부 이벤트 핸들러

static void on_rs232_poll_err( rs232_t *sender)
{
  if ( socket_reopen( sender))
  {
    if ( NULL != sender->on_error)
    {
      sender->on_error( sender, 0);
    }
  }
  else
  {
    if ( NULL != sender->on_error)
    {
      sender->on_error( sender, -1);
    }
    rs232_close( sender);
  }
}

static void on_rs232_poll_hup( rs232_t *sender)
{
}

static void on_rs232_poll_in( rs232_t *sender)
{
  int   sz_read;

                                  // 데이터 핸들러가 없을 때에도
                                  // poll 검색이 계속 발생되는 것을 막기 위해
                                  // 수신 버퍼를 비운다.

  if ( NULL == sender->on_read)
  {
                                  // 읽어 들인 데이터의 크기가 0 이하라면
                                  // 소켓에 에러가 발생한 경우 이므로
                                  // on_disconnected 를 발생하고 소켓을 close 한다.

    sz_read = read( sender->fd, __sock_buf, __MAX_BUF_SIZE);
    if ( 0 >= sz_read)
    {
      if ( NULL != sender->on_error)
      {
        on_rs232_poll_err( sender);  
      }
    }
  }
  else
  {
    sender->on_read( sender);
  }
}

void on_rs232_poll_out( rs232_t *sender)
{
  if ( NULL != sender->on_writable)
  {
    sender->on_writable( sender);
  }
}

////////////////////////////////////////////////////////////////////// 공개 함수

//--------------------------------------------------------------------
// 설명: rs232 소켓을 생성하고 open 한다.
// 인수: _port        : uds 에 사용할 파일 이름
// 반환: 0 = 에러 없음
//       0 > 에러 발생
//--------------------------------------------------------------------
rs232_t  *rs232_open( char *_devname, int _baud, int _databit, int _parity, int _stopbit)
{
  rs232_t *sock;

                                  // 실행 중에 발생한 에러를 알기 위해
                                  // neterr_no 를 전역변수로 두고
                                  // 함수 수행 전에 ERR_NONE 로 초기화한다.

  neterr_no = NERR_NONE;

                                  // 장치명이 존재하는지를 확인한다.

  if( 0 != access(_devname , F_OK ))                                  // 디바이스 파일이 없다면
  {
      neterr_no = NERR_NO_DEVICE;
      return NULL;
  }

                                  // tcp server 를 운영하기 위한 오브젝트를 생성한다.
                                  // 메모리 생성에 실패했다면 복귀한다.
  sock      = new_socket();
  if ( NULL == sock)                                                  // 핸들 생성에 실패했다면
  {
    neterr_no   = NERR_NO_MEMORY;                                     // 메모리 생성 실패
    return sock;                                                      // 복귀한다.
  }
                                  // 핸들 생성에 성공했다면
                                  // 소켓에 필요한 기본 정보를 지정한다.

  strcpy( sock->devname, _devname);
  sock->baud          = _baud;
  sock->databit       = _databit;
  sock->parity        = _parity;
  sock->stopbit       = _stopbit;

                                  // 소켓을 open 한다.

  if ( NERR_NONE != socket_open( sock) )
  {
    neterr_no   = NERR_NOT_OPENED;
    free( sock);
    return NULL;
  }
                                  // 소켓을 poll_array 에 등록한다.
                                  // poll_array 에 등록하지 못했다면 에러를 반환한다.

  if ( 0 > poll_register( (net_obj_t *)sock))
  {
    neterr_no   = NERR_NO_POLL;
    free( sock);
    return NULL;
  }

  return sock;
}

//--------------------------------------------------------------------
// 설명: 소켓을 통해 데이터를 수신한다.
// 인수: _sock      : 소멸 대상 소켓 정보
//       _buf       : 수신 버퍼 포인터
//       _buf_size  : 수신 버퍼 크기
//--------------------------------------------------------------------
int rs232_read( rs232_t *_sock, char *_buf, int _buf_size)
{
  int   sz_read;

  memset(_buf, 0,_buf_size);
  sz_read   = read(_sock->fd,_buf,_buf_size);

  if ( 0 >= sz_read)
  {
    on_rs232_poll_err(_sock);
  }
  return sz_read;
}

//--------------------------------------------------------------------
// 설명: 소켓에 데이터를 전송한다.
// 인수: _sock      - 소멸 대상 소켓 정보
//       _buf       - 전송할 데이터의 버퍼 포인터
//       _buf_size  - 데이터의 길이
//--------------------------------------------------------------------
int rs232_write( rs232_t *_sock, char *_buf, int _buf_size)
{
  return  write(_sock->fd,_buf,_buf_size);
}

//--------------------------------------------------------------------
// 설명: 모든 TCP/IP 객체에서 특정 tag 값을 갖는 객체를 찾는다.
// 인수: _tag       - 찾을 tag 값
// 반환  NULL       - 찾지 못했음
//       rs232_t *    - 해당 객체
//--------------------------------------------------------------------
rs232_t *rs232_find_tag( int _tag)
{
  rs232_t  *sock;
  int       cnt_objs;
  int       ndx;

  cnt_objs = poll_count();

  for ( ndx = 0; ndx < cnt_objs; ndx++)
  {
    sock  = ( rs232_t *)poll_obj( ndx);
    if ( NULL != sock)
    {
      if ( ( STYP_RS232 == sock->type) && (_tag == sock->tag))
      {
        return sock;
      }
    }
  }
  return  NULL;
}

//--------------------------------------------------------------------
// 설명: 소켓을 close 하고 object 를 소멸한다.
// 인수: _sock  : 소멸 대상 소켓 정보
//--------------------------------------------------------------------
void rs232_close( rs232_t *_sock)
{
  socket_close( _sock);
                                  // socket 에 해당되는 관련 정보를 소멸
                                  // 또는 초기화한다.

  poll_unregister( (net_obj_t *)_sock);
  free(_sock);
}
