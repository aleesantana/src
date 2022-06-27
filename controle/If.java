package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
			
		System.out.println("Informe a média: ");
		String media = op.nextLine().replace(",", "."); //recebe String para poder aceitar . ou , com o replace.
		
		double media1 = Double.parseDouble(media); //conerte a string media em double media1, para poder ser numérico
		
		
		if(media1 <= 10 && media1 >= 7) {
			System.out.println("Aprovado");
			System.out.println("Parabéns!");
		}
		
		if(media1 < 7 && media1 >= 4.5 ) {
			System.out.println("Recuperação.");
		}
		
		if(media1 < 4.5 && media1 >= 0 ) {
			System.out.println("Reprovado.");
		}
		
		
		op.close();
	}
}
