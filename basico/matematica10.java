package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o lado a do triângulo: ");
		double ladoA = sc.nextDouble();

		System.out.print("Digite o lado b do triângulo: ");
		double ladoB = sc.nextDouble();

		System.out.print("Digite o lado c do triângulo: ");
		double ladoC = sc.nextDouble();

		System.out.print("Digite a altura h relativa do lado b do triângulo: ");
		double altura = sc.nextDouble();

		double perimetro = ladoA + ladoB + ladoC;
		double area = (ladoB * altura) / 2;

		System.out.println("O perímetro do triângulo é: " + perimetro);
		System.out.println("A área do triângulo é: " + area);

		sc.close();
	}
}
