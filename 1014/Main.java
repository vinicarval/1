import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        
        int num1 = scanner.nextInt();
        double num2 = scanner.nextDouble();
        
        double gasto = num1 / num2;
        
        System.out.println(df.format(gasto) + " km/l");
    }
}