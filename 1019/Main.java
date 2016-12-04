import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        
        int segundos = s.nextInt();
        transformar(segundos);
    }
    
    public static void transformar(int n)
    {
        int sec = 0;
        int min = 0;
        int hour = 0;
        
        sec = n % 60;
        n /= 60;
        
        min = n % 60;
        hour = n / 60;
        
        System.out.println(hour + ":" + min + ":" + sec);
    }
}