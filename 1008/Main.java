import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        
        int num = scanner.nextInt();
        int hours = scanner.nextInt();
        double sal = scanner.nextDouble();
        
        double result = sal * hours;
        
        System.out.println("NUMBER = " + num);
        System.out.println("SALARY = U$ " + decimalFormat.format(result));
        
    }
}
