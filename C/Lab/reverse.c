#include <stdio.h>
#include <string.h>

void reverseStr(char *str){
    char *start = str;
    char *end = str + strlen(str) - 1;
    char temp;
    while(start < end){
        temp = *start;
        *start = *end;
        *end = temp;
        start++;
        end--;
    }
}

int main(){
    char str[100];  
    printf("Enter a string: ");
    gets(str);
    reverseStr(str);
    printf("Reversed string is: %s", str);
    return 0;
}