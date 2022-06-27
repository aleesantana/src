package conversoes;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		
		System.out.println("Informe o primeiro salário: ");
		String valor1 = op.nextLine().replace(",", "."); //replace = substitui , pelo ponto ou vice verso.
		
		System.out.println("Informe o segundo salário: ");
		String valor2 = op.nextLine().replace(",", "."); 
		
		System.out.println("Informe o terceiro salário: ");
		String valor3 = op.nextLine().replace(",", "."); 
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A média dos saálrios é: "+ media);

		op.close();
	}
}
