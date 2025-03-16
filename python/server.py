import socket
import struct

def process_binary_data_1(data):
    """기본 예제: 정수 및 문자열 출력"""
    format_string = "!i10s"
    unpacked_data = struct.unpack(format_string, data)
    integer_value = unpacked_data[0]
    string_value = unpacked_data[1].decode('utf-8').rstrip(b'\x00'.decode('utf-8'))

    print(f"정수 값: {integer_value}")
    print(f"문자열 값: {string_value}")

def process_binary_data_2(data):
    """다양한 데이터 형식 처리"""
    format_string = "!hfb"
    unpacked_data = struct.unpack(format_string, data)
    integer_value = unpacked_data[0]
    float_value = unpacked_data[1]
    char_value = unpacked_data[2].to_bytes(1, 'big').decode('utf-8')

    print(f"정수 값: {integer_value}")
    print(f"부동소수점 값: {float_value}")
    print(f"문자 값: {char_value}")

def process_binary_data_3(data):
    """반복되는 데이터 처리"""
    format_string = "!5h"
    unpacked_data = struct.unpack(format_string, data)

    for i, value in enumerate(unpacked_data):
        print(f"정수 {i+1}: {value}")

def process_binary_data_4(data):
    """동적 크기 문자열 처리"""
    string_length = data[0]
    string_value = data[1:string_length+1].decode('utf-8')

    print(f"문자열 길이: {string_length}")
    print(f"문자열 값: {string_value}")

class CustomStruct:
    def __init__(self, x, y, z):
        self.x = x
        self.y = y
        self.z = z

    def __str__(self):
        return f"CustomStruct(x={self.x}, y={self.y}, z={self.z})"

def process_binary_data_5(data):
    """사용자 정의 구조체 처리"""
    format_string = "!id16s"
    unpacked_data = struct.unpack(format_string, data)
    custom_struct = CustomStruct(unpacked_data[0], unpacked_data[1], unpacked_data[2].decode('utf-8').rstrip(b'\x00'.decode('utf-8')))

    print(custom_struct)

# 서버 소켓 설정
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_socket.bind(('127.0.0.1', 12345))
server_socket.listen(1)

print("클라이언트 연결 대기...")
client_socket, addr = server_socket.accept()
print(f"클라이언트 연결됨: {addr}")

# 바이너리 데이터 생성 (클라이언트에서 전송할 데이터)
binary_data_1 = struct.pack("!i10s", 123, b"hello\x00\x00\x00\x00\x00")
binary_data_2 = struct.pack("!hfb", 42, 3.14, 97)
binary_data_3 = struct.pack("!5h", 10, 20, 30, 40, 50)
binary_data_4 = b'\x05hello'
binary_data_5 = struct.pack("!id16s", 1, 2.71828, b"custom_struct\x00\x00\x00")

# 클라이언트에서 데이터 전송 예시 (각 예제에 맞는 데이터 전송)
# client_socket.sendall(binary_data_1)
# client_socket.sendall(binary_data_2)
# client_socket.sendall(binary_data_3)
# client_socket.sendall(binary_data_4)
# client_socket.sendall(binary_data_5)

# 서버에서 데이터 수신 및 처리
# 어떤 데이터를 수신할지 선택 (binary_data_1 ~ binary_data_5 중 하나)
received_data = client_socket.recv(len(binary_data_5)) # 예시로 binary_data_5를 수신
process_binary_data_5(received_data)

# 소켓 종료
client_socket.close()
server_socket.close()
