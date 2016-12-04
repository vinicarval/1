import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        
        String entrada1 = scanner.nextLine();
        String arrayEntrada1[] = entrada1.split(" ");
        
        double A, B, C;
        A = Double.parseDouble(arrayEntrada1[0]);
        B = Double.parseDouble(arrayEntrada1[1]);
        C = Double.parseDouble(arrayEntrada1[2]);
        
        
        double triangulo = A * C / 2;
        double circulo = C * C * 3.14159;
        double trapezio = (A + B) * C / 2;
        double quadradro = B * B;
        double retangulo = A * B;
        
        System.out.println("TRIANGULO: " + df.format(triangulo));
        System.out.println("CIRCULO: " + df.format(circulo));
        System.out.println("TRAPEZIO: " + df.format(trapezio));
        System.out.println("QUADRADO: " + df.format(quadradro));
        System.out.println("RETANGULO: " + df.format(retangulo));
    }
}