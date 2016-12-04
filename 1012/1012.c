#include <stdio.h>
#include <stdlib.h>

#define PI 3.14159
int main(int argc, char** argv) {

    double a, b, c;
    
    scanf("%lf %lf %lf", &a, &b, &c);
    printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", a*c/2.0, c*c*PI,(a+b)*c/2,b*b,a*b);
    
    return (EXIT_SUCCESS);
}

