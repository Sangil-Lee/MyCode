import socket
import struct

# 서버 IP 및 포트
HOST = '127.0.0.1'
PORT = 12345

# 클라이언트 소켓 생성 및 연결
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client_socket.connect((HOST, PORT))

# 전송할 데이터 선택 (binary_data_1 ~ binary_data_5 중 하나)
binary_data_5 = struct.pack("!id16s", 1, 2.71828, b"custom_structdfdafdafdafdafdafdaf\x00\x00\x00")

# 데이터 전송
client_socket.sendall(binary_data_5)

# 소켓 종료
client_socket.close()
