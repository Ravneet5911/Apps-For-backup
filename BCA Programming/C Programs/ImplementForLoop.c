#include<stdio.h>

int main() {
    int num, i;
    printf("Enter a number");
    scanf("%d", &num);
    
    for(i=0; i<num; i++) {
        printf("%d ", i+1);
    }
}