package operadoreslogicos;

public class OperadoresUnarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		
		//operadores antes ou depois s� muda a prioridade. Se tiver antes, vai acrescentar antes de operar. Se tiver depois, vai 
		//operar antes de acrescentar.
		a++;
		a--;
		
		++b;
		--b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); //++a significa que o incremento � feito antes de comparar, e b-- significa que o incremento ser� depois da compara��o
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
