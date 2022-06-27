package controle;

import javax.swing.JOptionPane;

public class InElseIf {
	public static void main(String[] args) {
		
		//RECEBE A NOTA
		String nota1 = JOptionPane.showInputDialog("Informe a nota: ");
		Double nota = Double.parseDouble(nota1);
		
		//VERIFICA A NOTA E FORNECE O CONCEITO:
		if(nota > 10 || nota < 0) {
			System.out.println("Nota inválida.");
		}
		else if(nota >= 8.1) {
			System.out.println("Nota: "+nota+". Conceito A. Aprovado.");
			}
		else if (nota >= 6.1) {
			System.out.println("Nota: "+nota+". Conceito B. Aprovado.");
			}
		else if (nota >= 4.1) {
			System.out.println("Nota: "+nota+". Conceito C. Recuperação.");
			}
		else if (nota >= 2.1) {
			System.out.println("Nota: "+nota+". Conceito D. Recuperação.");
			}
		else {
			System.out.println("Nota: "+nota+". Conceito E. Reprovado.");
			}
	}
}
