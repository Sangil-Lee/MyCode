#ifndef __NET_INC_H__
#define __NET_INC_H__

                                        // ���� �ڵ� ����
                                  
#define NERR_NONE           0                                         // �Լ� ���࿡ ������ ������
#define NERR_NO_MEMORY     -1                                         // ��ü ������ ����
#define NERR_NOT_OPENED    -2                                         // ���� open �� ����
#define NERR_BIND_FAILURE  -3                                         // ���� bind �� ����
#define NERR_NO_POLL       -4                                         // ���� �߰��� �� �ڸ��� ����
#define NERR_NOT_CONNECT   -5                                         // ��� ȣ��Ʈ�� ���ῡ ����
#define NERR_NO_DEVICE     -6                                         // ��ġ���� ����
                                
                                        // �ʿ� ��� ����
                                  
#define POLL_MAX_COUNT      50                                        // poll array �� ũ��, �� ���ÿ� ���� �� �մ� ���� �ִ� ����
#define IP_ADDR_SIZE        20                                        // IP �ּ��� ũ��

            
                                        // ���� ���� ����
#define __MAX_BUF_SIZE      1024

char    __sock_buf[__MAX_BUF_SIZE];                                   // ��� ���̺귯������ �ӽ÷� ����ϴ� ����
int     neterr_no;                                                    // ���� �ڵ�

#endif
