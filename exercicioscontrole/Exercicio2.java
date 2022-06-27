package exercicioscontrole;

import java.util.Scanner;

public class Exercicio2 {
	/* Criar um programa que receba duas notas e calcule a m�dia final.
	 * Se a nota for maior ou igual a 7.0 imprime na tela "Aprovado",
	 * se a nota for menor que 7.0 e maior que 4.0 imprime no console 
	 * "Recupera��o", caso contrario imprime "Reprovado".
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nota Parcial 1: ");
		double nota1 = scanner.nextDouble();

		System.out.println("Nota Parcial 2: ");
		double nota2 = scanner.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println("Sua m�dia foi " + media + " e voc� est� Aprovado.");
		} else if (media >= 4) {
			System.out.println("Sua m�dia foi " + media + " e voc� est� de Recupera��o.");
		} else {
			System.out.println("Sua m�dia foi " + media + " e voc� est� Reprovado.");
		}

		scanner.close();
		
	}
}
