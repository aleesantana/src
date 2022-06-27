package conversoes;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		
		System.out.println("Informe o primeiro sal�rio: ");
		String valor1 = op.nextLine().replace(",", "."); //replace = substitui , pelo ponto ou vice verso.
		
		System.out.println("Informe o segundo sal�rio: ");
		String valor2 = op.nextLine().replace(",", "."); 
		
		System.out.println("Informe o terceiro sal�rio: ");
		String valor3 = op.nextLine().replace(",", "."); 
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A m�dia dos sa�lrios �: "+ media);

		op.close();
	}
}
