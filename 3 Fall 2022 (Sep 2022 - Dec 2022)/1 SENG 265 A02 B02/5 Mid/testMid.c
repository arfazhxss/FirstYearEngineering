#include <stdio.h>

int mystery (int nnn[], int mmm) {
    int ppp=0;
    for (int i=0; i< mmm-1; i++) {
        for (int j=nnn[i]+1; j< nnn[i+1]; j++) {
            printf("%d\n", j);
            ppp++;
        }
    }
    return ppp;
}

int main() {
    int a[6] = {3,5,9,10,12};
    printf(">>>%d\n",mystery(a,5));
    return 0;
}