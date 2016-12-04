import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        
        Scanner s = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.0000");
        
        double raio = s.nextDouble();
        double area = raio * raio * 3.14159;
        
       
        System.out.println("A=" + format.format(area));       
    }
}