#ifndef __NET_INC_H__
#define __NET_INC_H__

                                        // 에러 코드 정의
                                  
#define NERR_NONE           0                                         // 함수 실행에 에러가 없었음
#define NERR_NO_MEMORY     -1                                         // 객체 생성에 실패
#define NERR_NOT_OPENED    -2                                         // 소켓 open 에 실패
#define NERR_BIND_FAILURE  -3                                         // 소켓 bind 에 실패
#define NERR_NO_POLL       -4                                         // 폴에 추가할 빈 자리가 없음
#define NERR_NOT_CONNECT   -5                                         // 상대 호스트와 연결에 실패
#define NERR_NO_DEVICE     -6                                         // 장치명이 없음
                                
                                        // 필요 상수 정의
                                  
#define POLL_MAX_COUNT      50                                        // poll array 의 크기, 즉 동시에 열릴 수 잇는 소켓 최대 개수
#define IP_ADDR_SIZE        20                                        // IP 주소의 크기

            
                                        // 전역 변수 선언
#define __MAX_BUF_SIZE      1024

char    __sock_buf[__MAX_BUF_SIZE];                                   // 통신 라이브러리에서 임시로 사용하는 버퍼
int     neterr_no;                                                    // 에러 코드

#endif
