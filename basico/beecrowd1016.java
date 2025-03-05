import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        var distancia = sc.nextInt();
        
        var tempo = distancia * 2;
        
        System.out.printf("%d minutos%n", tempo);
        
        sc.close(); 
    }
}
