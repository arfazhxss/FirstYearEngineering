#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{

    /*
     * variable to store the final answer
     */
    long int factorial = 1;

    /*
     * WRITE YOUR CODE TO DO COMMAND LINE INPUT CHECKING HERE
     */

	if (argc != 2) { 
		printf("please give out arguments here!\n");
		exit(1);
 }

    /*
     * Takes the command line input and converts it into int.
     */
    int num = atoi(argv[1]);
    for (int i=1; i<=num; i++) {
	factorial*=i;
}

    printf("%ld\n", factorial);
}
