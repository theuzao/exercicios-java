package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor de a: ");
		double a = sc.nextDouble();

		System.out.print("Insira o valor de b: ");
		double b = sc.nextDouble();

		System.out.print("Insira o valor de c: ");
		double c = sc.nextDouble();

		double delta = Math.pow(b, 2) - 4 * a * c;

		System.out.println("O delta da equação é: " + delta);

		sc.close();
	}
}
