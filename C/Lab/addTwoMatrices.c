#include <stdio.h>

int main(){
    printf("Enter the number of rows and columns of a square matrix: ");
    int m, n;
    scanf("%d %d", &m, &n);
    int a[m][n], b[m][n], c[m][n];
    printf("Enter the elements of first matrix: \n");
    for(int i = 0; i < m; i++){
        for(int j = 0; j< n; j++){
            scanf("%d", &a[i][j]);
        }
        printf("\n");
    }
    printf("Elements of first array: \n");
    for(int i = 0; i < m; i++){
        for(int j = 0; j< n; j++){
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }
    printf("Enter the elements of second matrix: \n");
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            scanf("%d", &b[i][j]);
        }
        printf("\n");
    }
    printf("Elements of second array: \n");
    for(int i = 0; i < m; i++){
        for(int j = 0; j< n; j++){
            printf("%d ", b[i][j]);
        }
        printf("\n");
    }
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            c[i][j] = a[i][j] + b[i][j];
        }
    }
    printf("Summation of 2 matrices: \n");
    for(int i = 0;i < m; i++){
        for(int j = 0; j < n; j++){
            printf("%d ",c[i][j]);
        }
        printf("\n");
    }
}