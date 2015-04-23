#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <sys/time.h>
#include <sys/stat.h>

#include "netinc.h"
#include "pollmanager.h"
#include "rs232.h"
#include "sample.h"

#define   MAX_BUF_SIZE    1024

char  sample_buf[MAX_BUF_SIZE];

////////////////////////////////////////////////////////////////////// 소켓에서 에러가 발생

void on_error( rs232_t *sender, int reopen_ok)
{
                                  // 이벤트 핸들이 발생하기 전에
                                  // 소켓을 재 오픈합니다.
                                  // 즉, rs 에 대해 file descriptor 를 다시 생성합니다.
                                  // 이후 on_errror() 이벤트가 발생하며,
                                  // reopen_ok = 0  : 다시 오픈에 성공했다면 
                                  // reopen_ok = -1 : 다시 오픈에 실패
                                  //                  이벤트 핸들러에서 복귀되면, 자동으로
                                  //                  rs232_t 포인터는 소멸되며 NULL 값을 가지게 됩니다.
                                  //                  잠시 후에 rs232_t * 객체를 생성하십시오.

  if ( 0 == reopen_ok)
  {
    printf( "232 포트에 에러가 발생했으나\n");
    printf( "%s 포트를 다시 열었습니다.\n", sender->devname);
  }
  else
  {
    printf( "232 포트에 에러가 발생했고,\n");
    printf( "다시 포트 열기에 실패했습니다.\n");
    printf( "통신이 중단됩니다.\n");
    printf( "또한 sender 은 소멸되며, NULL 이되므로\n");
    printf( "이후로 통신 객체를 사용하시면 안됩니다!!\n");
  }
}

////////////////////////////////////////////////////////////////////// 클라이언트로부터 자료 수신

void on_read( rs232_t *sender)
{
  int     sz_read;

  sz_read = rs232_read( sender, sample_buf, MAX_BUF_SIZE);
  if ( 0 < sz_read)                                                   // 반드시 0 < 임을 확인한다.
  {
    printf( "-> %s\n", sample_buf);
    rs232_write( sender, sample_buf, sz_read);                        // 상대 PC 로 자료 전송  
  }
  else
  {
                                  // 읽어 들인 데이터의 크기가 0 또는 음수가되면
                                  // on_error() 이벤트 핸들러가 호출됩니다.
                                  // on_error() 이벤트 핸들러의 reopen_ok 값이
                                  // 음수가 되면, 이 on_read() 이벤트는 더 이상
                                  // 발생하지 않습니다.
    printf( "read error\n");                                  
  }
}

////////////////////////////////////////////////////////////////////// main process

int main( int argc, char **argv)
{
  rs232_t	*rs232;                                                   
  char		*text  = "abcdefghijklmnopqrstuvwxyz";


  printf( "****************************\n");
  printf( "rs232 sample\n");
  printf( "%s\n", argv[0]);
  printf( "****************************\n");

  poll_init();                                                        // poll 메니저를 초기화

                                  // 서버 소켓 준비

  rs232  = rs232_open( "/dev/ttyS0", 115200, 8, 'n', 1);
  if ( NULL == rs232)                                                 // 소켓 생성에 실패했다면
  {
		printf( "error = %d\n", neterr_no);
		exit(1);
  }
  rs232->on_read  = on_read;
  rs232->on_error = on_error;

                                  // 루프 테스트

  rs232_write( rs232, text, strlen( text));                           // 다른 rs232 포트(rs232 용 파일)로 전송 가능

  while( 1)
  {
    poll_loop(1000);
  }
}
