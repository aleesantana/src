package operadoreslogicos;

public class OperadoresTernarios {
	public static void main(String[] args) {
		
		double media = 7.6;
		//String resultadoParcial =
		String resultadoFinal = media >= 7.0  ? "Aprovado" :  "reprovado";
		System.out.println("O aluno está "+ resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s", resultado);
		
	}
}
