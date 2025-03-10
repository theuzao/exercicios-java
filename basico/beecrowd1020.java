import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        
        // Calculando anos
        int anos = idade / 365;
        idade = idade % 365;

        // Calculando meses
        int meses = idade / 30; 
        idade = idade % 30;

        // Calculando dias
        int dias = idade;
    
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, dias);
        
        sc.close();
    }
}
