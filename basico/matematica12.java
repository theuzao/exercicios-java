package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a massa do objeto: ");
		double massa = sc.nextDouble();

		System.out.print("Digite a velocidade do objeto: ");
		double velocidade = sc.nextDouble();

		double energiaCinetica = (massa * Math.pow(velocidade, 2)) / 2;

		System.out.println("A energia cinética do objeto é: " + energiaCinetica);

		sc.close();
	}
}
