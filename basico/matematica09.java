package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a largura do retângulo: ");
		double largura = sc.nextDouble();

		System.out.print("Digite o comprimento do retângulo: ");
		double comprimento = sc.nextDouble();

		double perimetro = 2 * (largura + comprimento);
		double area = largura * comprimento;

		System.out.println("O perímetro do retângulo é: " + perimetro);
		System.out.println("A área do retângulo é: " + area);

		sc.close();
	}
}
