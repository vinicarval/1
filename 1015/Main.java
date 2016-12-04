import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
        
        String entrada1 = scanner.nextLine();
        String entrada2 = scanner.nextLine();
        
        String arryEntrada1[] = entrada1.split(" ");
        String arryEntrada2[] = entrada2.split(" ");
        
        double x1 = Double.parseDouble(arryEntrada1[0]);
        double y1 = Double.parseDouble(arryEntrada1[1]);
        double x2 = Double.parseDouble(arryEntrada2[0]);
        double y2 = Double.parseDouble(arryEntrada2[1]);
        
        System.out.println(df.format(distancia(x1, x2, y1, y2)));
    }
    
    public static double distancia(double x1, double x2, double y1, double y2)
    {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
