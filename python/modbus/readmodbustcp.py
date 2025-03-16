from pymodbus.client import ModbusTcpClient
import struct

client = ModbusTcpClient('127.0.0.1', port=502)
client.connect()

def write_float(client, address, value):
    """지정된 주소에 32비트 float 값을 씁니다."""
    #byte_data = struct.pack('>f', value)  # float 값을 바이트로 변환 (빅 엔디안)
    byte_data = struct.pack('<f', value)  # float 값을 바이트로 변환 (리틀 엔디안)
    registers = struct.unpack('>HH', byte_data)  # 바이트를 2개의 16비트 레지스터로 분할
    client.write_registers(address, registers)

# 쓰기
#client.write_register(address=1, value=1234, unit=1)

# 읽기
#result = client.read_holding_registers(address=0, count=10, unit=1)
result = client.read_holding_registers(address=0, count=3)
if not result.isError():
    print(result.registers)

result = client.read_holding_registers(address=3, count=2)
if not result.isError():
    #print(result.registers)
    registers = result.registers;
    #byte_data = struct.pack('>HH', registers[1], registers[0])  # 상위 레지스터가 먼저, big-endian
    byte_data = struct.pack('<HH', registers[1], registers[0])  # 상위 레지스터가 먼저, little-endian
    float_value = struct.unpack('>f', byte_data)[0]
    print(float_value)

write_float(client, address=5, value=87.754)

client.close()
