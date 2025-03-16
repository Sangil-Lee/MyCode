import struct

i = 2
a = 1.
b = 3.
c = 88.

data_bytes = struct.pack('<Hfff',i,a,b,c)
print(data_bytes)

parsed = struct.unpack('<Hfff',data_bytes)
print(parsed)
