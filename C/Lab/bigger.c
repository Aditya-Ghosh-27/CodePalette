#include <stdio.h>

void bigger(int *a, int *b)
{
    if (*a > *b)
    {
        printf("%d is bigger.", *a);
    }
    else
    {
        printf("%d is bigger.", *b);
    }
}

int main()
{
    int a, b;
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);
    bigger(&a, &b);
    return 0;
}