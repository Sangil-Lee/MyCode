#ifndef __RS_232_H__
#define __RS_232_H__

#define RS_NONE_PARITY      0                                         // 패리티 없음
#define RS_ODD_PARITY       (PARODD|PARENB)                           // 홀수 패리티        
#define RS_EVEN_PARITY      PARENB                                    // 짝수 패리티
#define RS_1_STOP_BIT       0                                         // 1 stop bit    
#define RS_2_STOP_BIT       CSTOPB                                    // 2 stop bit

typedef struct rs232_t_ rs232_t;
struct rs232_t_
{
  int   poll_ndx;
  int   fd;
  int   type;                                     // tcp/udp/uds/serial/
  int   tag;
  void  (*on_poll_in )( rs232_t *);
  void  (*on_poll_out)( rs232_t *);
  void  (*on_poll_err)( rs232_t *);
  void  (*on_poll_hup)( rs232_t *);

  char  devname[20];                                                  // 장치명을 담을 버퍼
  int   baud;  
  int   databit;
  int   stopbit;
  int   parity;
                    
  void  (*on_read    )( rs232_t *);
  void  (*on_writable)( rs232_t *);
  void  (*on_error   )( rs232_t *, int);
};
              
extern rs232_t *rs232_open ( char    *, int   , int, int, int);
extern int      rs232_write( rs232_t *, char *, int          );
extern int      rs232_read ( rs232_t *, char *, int          );
extern void     rs232_close( rs232_t *                       );
extern rs232_t *rs232_find_tag( int);

#endif                                                                // __RS_232_H__
