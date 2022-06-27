package controle;

import java.util.Scanner;

public class DesadioDiaSemana {
	public static void main(String[] args) {
		Scanner op =new Scanner (System.in);
		
		System.out.println("Digite o dia da semana: ");
		String dia = op.next();
		
		
		//o método equalsIgnoreCase compara a string digitada e ignora letras maiúsculas e minúsculas.
		//para comparar string nunca usamos ==, mas sim o método equals
		if(dia.equalsIgnoreCase("domingo")) { 
			System.out.println(1);
		} else if(dia.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		} else if(dia.equalsIgnoreCase("terça")||dia.equalsIgnoreCase("terca")) {
			System.out.println(3);
		} else if(dia.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if(dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if("sexta".equals(dia.toLowerCase())) { //pega a string digitada e lê somente em minúsculas
			System.out.println(6);
		} else if(dia.equalsIgnoreCase("sábado")|| dia.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		} else {
			System.out.println("Dia inválido.");
		}
		
		
		op.close();
	}
}
