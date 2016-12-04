import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        
        int num = s.nextInt();
        int result = (num * 90 - num * 60) / 15;
        
        System.out.println(result + " minutos");
        
    }
}