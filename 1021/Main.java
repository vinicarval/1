import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        double valor = s.nextDouble();
        decompor(valor);
        
    }
    public static void decompor(double valor)
    {
        if (valor < 0 || valor > 1000000.00)
            return;
        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota05 = 0;
        int nota02 = 0;
        int moeda100 = 0;
        int moeda050 = 0;
        int moeda025 = 0;
        int moeda010 = 0;
        int moeda005 = 0;
        int moeda001 = 0;

        while (valor >= 1.00) {
            if(valor >= 100) {valor -= 100; nota100++; }
            else if(valor >= 50) {valor -= 50; nota50++;}
            else if(valor >= 20) {valor -= 20; nota20++;}
            else if(valor >= 10) {valor -= 10; nota10++;}
            else if(valor >= 05) {valor -= 05; nota05++;}
            else if(valor >= 02) {valor -= 02; nota02++;}
            else if(valor >= 01) {valor -= 1; moeda100++;}
        }
        valor *= 100;
        while (valor >=1.00) {
            if(valor >= 50) {valor -= 50; moeda050++;}
            else if(valor >= 25) {valor -= 25; moeda025++;}
            else if(valor >= 10) {valor -= 10; moeda010++;}
            else if(valor >= 5) {valor -= 5; moeda005++;}
            else if(valor >= 1) {valor -= 1; moeda001++;}
        }
        System.out.println("NOTAS:");   
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota05 + " nota(s) de R$ 5.00");
        System.out.println(nota02 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");        
        System.out.println(moeda100 + " moeda(s) de R$ 1.00");
        System.out.println(moeda050 + " moeda(s) de R$ 0.50");
        System.out.println(moeda025 + " moeda(s) de R$ 0.25");
        System.out.println(moeda010 + " moeda(s) de R$ 0.10");
        System.out.println(moeda005 + " moeda(s) de R$ 0.05");
        System.out.println(moeda001 + " moeda(s) de R$ 0.01");        
    }
}
