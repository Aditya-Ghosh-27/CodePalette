#include <stdio.h>
#include <string.h>

int main(){
    char source[100];
    char dest[100];
    printf("Enter a string: ");
    gets(source);
    int i;
    for(i = 0; source[i] != '\0'; i++){
        dest[i] = source[i];
    }
    dest[i] = '\0';
    printf("Copied string is: %s", dest);
    return 0;
}