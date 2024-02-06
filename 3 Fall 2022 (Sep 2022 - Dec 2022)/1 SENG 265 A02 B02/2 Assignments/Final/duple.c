#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>

void swap (int* a, int* b) {
    int t = *a;
    *a = *b;
    *b = t;
}

void bsort (int arr[], int n) {
    for (int i=0; i<(n-1); i++) {
        for (int j=0; j<(n-2); j++) {
            if (arr[j]>arr[j+1]) {
                swap(&arr[j],&arr[j+1]);
            }
        }
    }
}

void remdup (int* arr) {
    int size=0;
    for (int i=0; arr[i]!=-1; i++) {size++;}
    printf("size:%d\n",size);
    bsort (arr, size);
    printf("sorted1:[");for (int i=0; i<size; i++) {printf("%d ",arr[i]);} printf("]\n");
    for (int i=0; i<size; i++) {
        for (int j=0; j<size;j++) {
            if ((i!=j)&&(arr[i]==arr[j])) {
                arr[j]=999;
            }
        }
    }
    printf("sorted2:[");for (int i=0; i<size; i++) {printf("%d ",arr[i]);} printf("]\n");
    int count=0;
    for (int i=0; i<size; i++) {
        if (arr[i]!=999) {++count;}
    }
    int *narr = (int*)calloc(count,sizeof(int));
    int j=0;
    for (int i=0; i<size; i++) {
        if (arr[i]!=999) {narr[j++]=arr[i];}
    }
    printf("main:[");for (int j=0; j<count; j++) {printf("%d ",narr[j]);} printf("]\n");
}

int main () {
    int arr[]={5,2,5,3,5,6,-1};
    int size = sizeof(arr)/sizeof(arr[0]);
    printf("start:[");for (int i=0; i<size; i++) {printf("%d ",arr[i]);} printf("]\n");
    remdup (arr);
}
