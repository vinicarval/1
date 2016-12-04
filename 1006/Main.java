import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        
        Scanner s = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        
        double num1 = s.nextDouble();
        double num2 = s.nextDouble();
        double num3 = s.nextDouble();
        
        double media = (num1 * 2 + num2 * 3 + num3 * 5) / 10;
        
        System.out.println("MEDIA = " + decimalFormat.format(media));
        
    }
}