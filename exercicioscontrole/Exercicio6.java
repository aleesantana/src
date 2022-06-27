package exercicioscontrole;

import java.util.Scanner;

public class Exercicio6 {
	/* Programa que enquanto estiver recebendo numeros 
	 * positivos, imprime no console a soma dos numeros inseridos,
	 * caso receba um número negativo, encerra o programa.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int somadorDeNumeros = 0;
		int numero = 0;

		while (numero >= 0) {
			System.out.println("Digite um numero inteiro (zero ou negativo para sair): ");
			numero = scanner.nextInt();
			if (numero >= 0) {
				somadorDeNumeros += numero;
				System.out.printf("\nSoma até o momento: %d\n", somadorDeNumeros);
			}
		}
		scanner.close();
	}
}
