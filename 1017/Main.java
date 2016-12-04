import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        
        System.out.println(df.format(n1 * n2 / 12.0));
        
    }
}
