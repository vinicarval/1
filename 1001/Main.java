import java.io.IOException;
 public class Main {
 
    public static void main(String[] args) throws IOException {
 
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        //int result = num1 + num2;
        
        System.out.println("X = " + (num1 + num2));
    }
}