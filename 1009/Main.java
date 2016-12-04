import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        
        String nome = scanner.nextLine();
        double salMin = scanner.nextDouble();
        double venda = scanner.nextDouble();
        
        double salMax = salMin + venda * 0.15;
        
        System.out.println("TOTAL = R$ " + decimalFormat.format(salMax));
    }
}