#include <stdio.h>
#include <string.h>

int main()
{
    char str1[100], str2[100];
    printf("Enter a string: ");
    gets(str1);
    printf("Enter another string: ");
    gets(str2);
    int i = 0, j = 0;
    while(str1[i] != '\0'){
        i++;
    }
    while(str2[j] != '\0'){
        str1[i] = str2[j];
        i++;
        j++;
    }
    printf("Concatenated string is: %s", str1);
    return 0;
}

// int main(){
//     char str[100], str1[100];
//     printf("Enter the first string: ");
//     gets(str);
//     printf("Enter the second string: ");
//     gets(str1);
//     strcat(str, str1);
//     printf("Concatenated string is: %s", str);
//     return 0;
// }