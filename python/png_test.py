import struct

fstr = 'test.png'

valid_png_hdr = b'\x89PNG\r\n\x1a\n'

with open(fstr,'rb') as f:
    read_data = f.read(30)
    print(read_data[:8])

    #w,h = struct.unpack('>16x2L6x', read_data)

    if read_data[:8] == valid_png_hdr:
        w, h = struct.unpack(
            '>LL', # '2L',
            read_data[16:24]
        )
        print( f"{fstr} is a valid png file. \n {w=},{h=}")
    else:
        print(f'{fstr} is not a valid png file')
