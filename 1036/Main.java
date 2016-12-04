import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");
        
        String entrada[] = s.nextLine().split(" ");
        
        double var[] = new double[entrada.length];
        for(int i = 0; i < var.length; i++)
            var[i] = Double.parseDouble(entrada[i]);
        double A = var[0];
        double B = var[1];
        double C = var[2];
        double delta=(B * B - 4 * A * C);
        
        if(A==0 || delta < 0)
        {
            System.out.println("Impossivel calcular");
            return;
        }
        
        double r1 = (-B + Math.sqrt(delta)) / (2*A);
        double r2 = (-B - Math.sqrt(delta)) / (2*A);
        System.out.println("R1 = " + df.format(r1));
        System.out.println("R2 = " + df.format(r2));
    }
}
