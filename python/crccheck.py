from crccheck.crc import Crc16

data = b"check crc data"
crc16_obj = Crc16.calc(data)

print(f"crc16: {hex(crc16_obj)}")
