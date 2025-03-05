import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int x = sc.nextInt();
        double y = sc.nextDouble();
        
        double consumo = (double) x / y; 
        
        System.out.printf("%.3f km/l%n", consumo);
        
        sc.close(); 
    }
}
