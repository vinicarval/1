#include <stdio.h>

int main(){
    char nome[1];
    double a,b;
    scanf("%s %lf %lf", &nome, &a, &b);
    printf("TOTAL = R$ %.2f\n", a+b*0.15);
    return 0;
}
