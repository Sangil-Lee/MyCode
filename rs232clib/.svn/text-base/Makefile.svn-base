TARGET		=	sample
OBJS			= sample.o rs232.o pollmanager.o
SRCS			= $(OBJS:.o=.c)
INCLUDEDIRS	+= 
LIVDIRS		+= 
CFLAGS		= $(INCLUDEDIRS) -W -Wall -O2
LDFLAGS     = $(LIVDIRS)

ifeq ($(prev),	arm)
   CC = arm-linux-gcc
else
   CC	= gcc
endif

$(TARGET): $(OBJS)
	$(CC) -lm -o $(LDFLAGS) $@ $^
										  
.c.o:
	$(CC) -c $(CFLAGS) $<
	
clean:
	rm	$(OBJS) $(TARGET)	
	@echo	"파일을 삭제했습니다."
	
dep :	
	gccmakedep $(SRCS)

# DO NOT DELETE
sample.o: sample.c /usr/include/stdio.h /usr/include/features.h \
#  /usr/include/sys/cdefs.h /usr/include/gnu/stubs.h \
  /usr/include/gnu/stubs.h \
  /usr/lib/gcc/i386-redhat-linux/3.4.6/include/stddef.h \
  /usr/include/bits/types.h /usr/include/bits/wordsize.h \
  /usr/include/bits/typesizes.h /usr/include/libio.h \
  /usr/include/_G_config.h /usr/include/wchar.h /usr/include/bits/wchar.h \
  /usr/include/gconv.h \
  /usr/lib/gcc/i386-redhat-linux/3.4.6/include/stdarg.h \
  /usr/include/bits/stdio_lim.h /usr/include/bits/sys_errlist.h \
  /usr/include/stdlib.h /usr/include/sys/types.h /usr/include/time.h \
  /usr/include/endian.h /usr/include/bits/endian.h \
  /usr/include/sys/select.h /usr/include/bits/select.h \
  /usr/include/bits/sigset.h /usr/include/bits/time.h \
  /usr/include/sys/sysmacros.h /usr/include/bits/pthreadtypes.h \
  /usr/include/bits/sched.h /usr/include/alloca.h /usr/include/unistd.h \
  /usr/include/bits/posix_opt.h /usr/include/bits/confname.h \
  /usr/include/getopt.h /usr/include/string.h /usr/include/sys/time.h \
  /usr/include/sys/stat.h /usr/include/bits/stat.h netinc.h pollmanager.h \
  rs232.h sample.h
rs232.o: rs232.c /usr/include/stdio.h /usr/include/features.h \
# /usr/include/sys/cdefs.h /usr/include/gnu/stubs.h \
  /usr/include/gnu/stubs.h \
  /usr/lib/gcc/i386-redhat-linux/3.4.6/include/stddef.h \
  /usr/include/bits/types.h /usr/include/bits/wordsize.h \
  /usr/include/bits/typesizes.h /usr/include/libio.h \
  /usr/include/_G_config.h /usr/include/wchar.h /usr/include/bits/wchar.h \
  /usr/include/gconv.h \
  /usr/lib/gcc/i386-redhat-linux/3.4.6/include/stdarg.h \
  /usr/include/bits/stdio_lim.h /usr/include/bits/sys_errlist.h \
  /usr/include/stdlib.h /usr/include/sys/types.h /usr/include/time.h \
  /usr/include/endian.h /usr/include/bits/endian.h \
  /usr/include/sys/select.h /usr/include/bits/select.h \
  /usr/include/bits/sigset.h /usr/include/bits/time.h \
  /usr/include/sys/sysmacros.h /usr/include/bits/pthreadtypes.h \
  /usr/include/bits/sched.h /usr/include/alloca.h /usr/include/string.h \
  /usr/include/unistd.h /usr/include/bits/posix_opt.h \
  /usr/include/bits/confname.h /usr/include/getopt.h \
  /usr/include/termios.h /usr/include/bits/termios.h \
  /usr/include/sys/ttydefaults.h /usr/include/fcntl.h \
  /usr/include/bits/fcntl.h netinc.h pollmanager.h rs232.h
pollmanager.o: pollmanager.c /usr/include/stdio.h /usr/include/features.h \
# /usr/include/sys/cdefs.h /usr/include/gnu/stubs.h \
  /usr/include/gnu/stubs.h \
  /usr/lib/gcc/i386-redhat-linux/3.4.6/include/stddef.h \
  /usr/include/bits/types.h /usr/include/bits/wordsize.h \
  /usr/include/bits/typesizes.h /usr/include/libio.h \
  /usr/include/_G_config.h /usr/include/wchar.h /usr/include/bits/wchar.h \
  /usr/include/gconv.h \
  /usr/lib/gcc/i386-redhat-linux/3.4.6/include/stdarg.h \
  /usr/include/bits/stdio_lim.h /usr/include/bits/sys_errlist.h \
  /usr/include/stdlib.h /usr/include/sys/types.h /usr/include/time.h \
  /usr/include/endian.h /usr/include/bits/endian.h \
  /usr/include/sys/select.h /usr/include/bits/select.h \
  /usr/include/bits/sigset.h /usr/include/bits/time.h \
  /usr/include/sys/sysmacros.h /usr/include/bits/pthreadtypes.h \
  /usr/include/bits/sched.h /usr/include/alloca.h /usr/include/unistd.h \
  /usr/include/bits/posix_opt.h /usr/include/bits/confname.h \
  /usr/include/getopt.h /usr/include/fcntl.h /usr/include/bits/fcntl.h \
  /usr/include/string.h /usr/include/sys/poll.h /usr/include/bits/poll.h \
  /usr/include/sys/time.h /usr/include/sys/socket.h \
  /usr/include/sys/uio.h /usr/include/bits/uio.h \
  /usr/include/bits/socket.h \
  /usr/lib/gcc/i386-redhat-linux/3.4.6/include/limits.h \
  /usr/lib/gcc/i386-redhat-linux/3.4.6/include/syslimits.h \
  /usr/include/limits.h /usr/include/bits/posix1_lim.h \
  /usr/include/bits/local_lim.h /usr/include/linux/limits.h \
  /usr/include/bits/posix2_lim.h /usr/include/bits/sockaddr.h \
  /usr/include/asm/socket.h /usr/include/asm/sockios.h \
  /usr/include/sys/stat.h /usr/include/bits/stat.h \
  /usr/include/netinet/in.h /usr/include/stdint.h /usr/include/bits/in.h \
  /usr/include/bits/byteswap.h /usr/include/arpa/inet.h netinc.h \
  pollmanager.h
