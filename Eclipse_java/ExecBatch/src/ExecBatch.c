/*
 ============================================================================
 Name        : ExecBatch.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(void) {
	puts("!!!Hello World!!!"); /* prints !!!Hello World!!! */
	chdir("C:\scale6\OrigenArp");
	system("kinac.bat");
	return EXIT_SUCCESS;
}
