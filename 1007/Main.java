import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        
        Scanner s = new Scanner(System.in);
       
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();        
        int num4 = s.nextInt();
        
        int diferenca = num1 * num2 - num3 * num4;
        
        System.out.println("DIFERENCA = " + diferenca);
        
    }
}