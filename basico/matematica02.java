import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		double numero1 = sc.nextDouble();

		System.out.print("Digite o segundo número: ");
		double numero2 = sc.nextDouble();
	
		double media = (numero1 + numero2) / 2;

		System.out.println("A média é: " + media);

	  	sc.close();

	}
}
