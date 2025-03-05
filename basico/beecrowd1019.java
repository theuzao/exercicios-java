import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // Total de segundos

        int horas = 0, minutos = 0, segundos = 0;

        // Calculando horas, minutos e segundos
        horas = n / 3600;
        n = n % 3600;

        minutos = n / 60;
        n = n % 60;

        segundos = n; 
        
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

        sc.close();
    }
}
