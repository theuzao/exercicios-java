package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a variação de espaço (∆s): ");
		double variacaoEspaco = sc.nextDouble();
		
		System.out.print("Digite a variação do tempo:(∆t): ");
		double variacaoTempo = sc.nextDouble();
		
		double velocidadeMedia = variacaoEspaco / variacaoTempo;
		
		System.out.println("A velocidade média é: " + velocidadeMedia);
		
		sc.close();
	}
}
