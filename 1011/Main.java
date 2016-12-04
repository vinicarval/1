import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        //(4/3) * pi * R3
        
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        
        double num1 = scanner.nextDouble();
        double volume = (4/3.0) * 3.14159 * (num1 * num1 * num1);
        System.out.println("VOLUME = " + decimalFormat.format(volume));
    }
}