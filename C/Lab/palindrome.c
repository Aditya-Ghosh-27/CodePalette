#include <stdio.h>
#include <string.h>

int main()
{
    char str[1000];
    printf("Enter a string: ");
    gets(str);
    int length = strlen(str);
    int isPalindrome = 1;
    for(int i = 0; i < length/2; i++){
        if(str[i] != str[length - i -1]){
            isPalindrome = 0;
            break;
        }
    }
    if(isPalindrome == 1){
        printf("%s is a palindrome string\n", str);
    } else{
        printf("%s is not a palindrome string\n", str);
    }
    return 0;
}