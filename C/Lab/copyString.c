#include <stdio.h>

void copyString(char *source, char *destination){
    while(*source != '\0'){
        *destination = *source;
        destination++;
        source++;
    }
    *destination = '\0';
}

int main(){
    char source[100], destination[100];
    printf("Enter a string: ");
    gets(source);
    copyString(source, destination);
    printf("Copied string is: %s", destination);
    return 0;
}