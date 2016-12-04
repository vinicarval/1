import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        
        String entrada1 = scanner.nextLine();
        String entrada2 = scanner.nextLine();
        
        String arrayEntrada1[] = new String[3];
        String arrayEntrada2[] = new String[3];
        
        arrayEntrada1 = entrada1.split(" ");
        arrayEntrada2 = entrada2.split(" ");
        
        double result = 0;
        result += (Double.parseDouble(arrayEntrada1[1]) * Double.parseDouble(arrayEntrada1[2]));
        result += (Double.parseDouble(arrayEntrada2[1]) * Double.parseDouble(arrayEntrada2[2]));
        
        System.out.println("VALOR A PAGAR: R$ " + decimalFormat.format(result));
    }
}