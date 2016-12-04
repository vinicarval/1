import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        
        int dinheiro = s.nextInt();
        decompor(dinheiro);
    }
    
    public static void decompor(int dinheiro)
    {
        if (dinheiro <= 0  || dinheiro >= 1000000)
            return;
        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota05 = 0;
        int nota02 = 0;
        int nota01 = 0;
        
        while (dinheiro > 0) {            
            if (dinheiro >= 100)
            {
                nota100++;
                dinheiro -= 100;
                continue;
            }
            if (dinheiro >= 50)
            {
                nota50++;
                dinheiro -= 50;
                continue;
            }
            if (dinheiro >= 20)
            {
                nota20++;
                dinheiro -= 20;
                continue;
            }
            if (dinheiro >= 10)
            {
                nota10++;
                dinheiro -= 10;
                continue;
            }
            if (dinheiro >= 05)
            {
                nota05++;
                dinheiro -= 05;
                continue;
            }
            if (dinheiro >= 02)
            {
                nota02++;
                dinheiro -= 02;
                continue;
            }
            if (dinheiro >= 01)
            {
                nota01++;
                dinheiro -= 01;
            }                
        }
        System.out.println(nota100 * 100 + nota50 * 50 + nota20 * 20 + nota10 * 10 + nota05 * 5 + nota02 * 2 + nota01);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota05 + " nota(s) de R$ 5,00");
        System.out.println(nota02 + " nota(s) de R$ 2,00");
        System.out.println(nota01 + " nota(s) de R$ 1,00");
    }

}