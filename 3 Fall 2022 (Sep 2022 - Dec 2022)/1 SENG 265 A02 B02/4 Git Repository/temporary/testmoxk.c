#include <stdio.h>
#include <string.h>

int main() {
    int i;
    int n = 21;
    int m = 4;
    char *separator = "";

    for (i=0; i<n; i+=m) {
        printf("%s%d",separator,i);
        if (i%m==0) {
            n--;
            m=((m+1)%4)+1;
            printf(" (m changed to: %d)",m);
        }
        separator=", ";
    }
    printf("\n");
}