package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as coordenadas do primeiro ponto:");

		System.out.print("Coordenada x: ");
		double x1 = sc.nextDouble();

		System.out.print("Coordenada y: ");
		double y1 = sc.nextDouble();

		System.out.println("\nDigite as coordenadas do segundo ponto:");

		System.out.print("Coordenada x: ");
		double x2 = sc.nextDouble();

		System.out.print("Coordenada y: ");
		double y2 = sc.nextDouble();

		double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println("\nA distância entre os pontos é: " + distancia);

		sc.close();
	}
}
