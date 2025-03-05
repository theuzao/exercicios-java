import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        var valor = sc.nextInt();
        int[] notas = {100, 50, 20, 10, 5, 2, 1}; // Cédulas disponíveis

        System.out.printf("%d%n", valor);

        for (int nota : notas) {
            int quantidade = valor / nota;
            valor = valor % nota;

            System.out.println(quantidade + " nota(s) de R$ " + nota + ",00");
        }

        sc.close();
    }
}
