package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
			
		System.out.println("Informe a m�dia: ");
		String media = op.nextLine().replace(",", "."); //recebe String para poder aceitar . ou , com o replace.
		
		double media1 = Double.parseDouble(media); //conerte a string media em double media1, para poder ser num�rico
		
		
		if(media1 <= 10 && media1 >= 7) {
			System.out.println("Aprovado");
			System.out.println("Parab�ns!");
		}
		
		if(media1 < 7 && media1 >= 4.5 ) {
			System.out.println("Recupera��o.");
		}
		
		if(media1 < 4.5 && media1 >= 0 ) {
			System.out.println("Reprovado.");
		}
		
		
		op.close();
	}
}
