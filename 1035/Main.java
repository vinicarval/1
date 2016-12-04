import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        String entrada[] = s.nextLine().split(" ");
        int var[] = new int[entrada.length];
        for(int i = 0; i < var.length; i++)
            var[i] = Integer.parseInt(entrada[i]);
        int A = var[0];
        int B = var[1];
        int C = var[2];
        int D = var[3];
        
        if(B > C)
            if (D > A)
                if((C+D)>(A+B))
                    if(C>=0 & D>=0)
                        if(A % 2 == 0)
                        {
                            System.out.println("Valores aceitos");
                            return;
                        }
        System.out.println("Valores nao aceitos");
    }
}
