#include<stdio.h>

int main() {
    int dnum;
    printf("Enter the day number (between 1-7)");
    scanf("%d", &dnum);

    switch (dnum)
    {
    case 1:
        printf("Monday");
        break;
    case 2:
        printf("Tuesday");
        break;
    case 3:
        printf("Wednesday");
        break;
    case 4:
        printf("Thursday");
        break;
    case 5:
        printf("Friday");
        break;
    case 6:
        printf("Saturday");
        break;
    case 7:
        printf("Sunday");
        break;
    default:
        printf("Invalid Choice");
        break;
    }
}