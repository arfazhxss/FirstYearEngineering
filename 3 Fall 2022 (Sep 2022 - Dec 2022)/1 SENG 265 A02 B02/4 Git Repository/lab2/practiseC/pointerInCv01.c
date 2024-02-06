#include <stdio.h>

int main () {
    	printf("Testing unit 1\n");
	FILE* outputfile = fopen("textfiletoread.txt", "r");
    	if (outputfile==NULL) {printf("Unable to open file!\n"); return 1;}
	
	char word[100];
	int i=0;
	while (fscanf(outputfile,"%99s",word)==1) {
		printf("The word [%d] read is: [%s]\n",i++,word);
		
	}
	fclose(outputfile);
	return 0;
}
