package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o raio do círculo: ");
		double raio = sc.nextDouble();
		
		double perimetro = 2 * Math.PI * raio;
		
		System.out.println("O perímetro do círculo é: " + perimetro);
		
		sc.close();
	}
}
