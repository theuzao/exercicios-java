package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o peso em KG: ");
		double peso = sc.nextDouble();

		System.out.print("Insira a altura em METROS: ");
		double altura = sc.nextDouble();

		double imc = peso / (altura * altura);

		System.out.println("O IMC é: " + imc);

		sc.close();

	}
}
