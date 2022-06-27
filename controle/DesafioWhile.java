package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		
		//declaração das variáveis
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		//recebimento da nota e verificação
		while (nota != -1) {
			System.out.println("Informe a nota (ou -1 p/ sair): ");
			nota = op.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			//encerramento do programa
			} else if(nota != -1){
				System.out.println("Nota inválida! ;D");
			}
		}
		//cálculo da média
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);
		op.close();
	}
}
