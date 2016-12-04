#include <stdio.h>
#include <stdlib.h>

#define PI 3.14159

int main(int argc, char** argv) {

    int raio;
    
    scanf("%d", &raio);
    printf("VOLUME = %.3f\n", 4.0/3*PI*raio*raio*raio);
    return (EXIT_SUCCESS);
}

