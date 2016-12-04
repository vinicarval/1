import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        
        String entrada = scanner.nextLine();
        String arrayEntrada[] = entrada.split(" ");
        
        int num1 = Integer.parseInt(arrayEntrada[0]);
        int num2 = Integer.parseInt(arrayEntrada[1]);
        int num3 = Integer.parseInt(arrayEntrada[2]);
        
        int result = maioAB(maioAB(num1, num2), num3);
        System.out.println(result + " eh o maior");
    }
    
    public static int maioAB(int a, int b) {
        
        return (a+b+Math.abs(a-b))/2;
        
    }
}