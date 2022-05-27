#include<stdio.h>

int main() {
    int a, b;
    printf("Enter the value of a and b\n");
    scanf("%d %d", &a, &b);

    if(a>b) {
        printf("%d is greater number", a);
    }
    else {
        printf("%d is greater number", b);
    }
}