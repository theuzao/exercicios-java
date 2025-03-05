import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        var tempoHora = sc.nextInt();
        var velMedia = sc.nextInt();
        
        var distancia = tempoHora * velMedia;
        
        var qntLitros = (double) distancia/12.0;
        
        System.out.printf("%.3f%n", qntLitros);
        
        sc.close(); 
    }
}
