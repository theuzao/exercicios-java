package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do raio da esfera: ");
		double raio = sc.nextDouble();

		double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

		System.out.println("O volume da esfera é: " + volume);

		sc.close();
	}
}
