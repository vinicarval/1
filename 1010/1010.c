#include <stdio.h>

#define tamanhoVetor 2

int main() {

    int codigo[tamanhoVetor];
    int qtd[tamanhoVetor];
    double valores[tamanhoVetor];
    double valor = 0;
    int i;
    for (i = 0; i < tamanhoVetor; i++) {
        scanf("%d %d %lf", &codigo[i], &qtd[i], &valores[i]);
        valor += valores[i] * qtd[i];
    }

    printf("VALOR A PAGAR: R$ %.2f\n", valor);

    return (0);
}

