#include <stdio.h>
#include <stdlib.h>

int main(int argc, char** argv) {

    int a, b, c;

    scanf("%d %d %d", &a, &b, &c);

    if (a > b && a > c) {
        printf("%d eh o maior\n", a);
    } else if (b > c) {
        printf("%d eh o maior\n", b);
    } else {
        printf("%d eh o maior\n", c);
    }
    return (EXIT_SUCCESS);
}