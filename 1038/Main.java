import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        
        final float[] tabela = {4, (float)4.5,5,2,(float)1.5};
        
        Scanner s = new Scanner(System.in);
        
        String value = s.nextLine();
        
        int opc1 = Integer.parseInt(value.split(" ")[0]);
        float opc2 = Float.parseFloat(value.split(" ")[1]);
        float result;
        
        DecimalFormat df = new DecimalFormat("#.00");
        result = tabela[opc1-1]*opc2;
        System.out.println("Total: R$ " + df.format(result));
    }
}