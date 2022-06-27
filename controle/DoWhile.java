package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.println("Quer sair? ");
			texto = op.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));	
		
		System.out.println("Obrigada!");

		op.close();
	}
}
