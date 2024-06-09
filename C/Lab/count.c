#include <stdio.h>

int main(){
    char str[1000];
    printf("Enter a string: ");
    gets(str);
    int count = 0;
    for(int i = 0; str[i] != '\0'; i++){
        if(str[i] != '\n'){
            count++;
        }
    }
    printf("The number of characters in the string is: %d", count);
    return 0;
}