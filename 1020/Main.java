import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        
        int dias = s.nextInt();
        transformar(dias);
    }
    
    public static void transformar(int dias)
    {
        int anos = dias / 365;
        dias %= 365;
        int meses = dias / 30;
        dias %= 30;
        
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

    }
}