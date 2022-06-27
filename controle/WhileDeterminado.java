package controle;

public class WhileDeterminado {
	public static void main(String[] args) {
		
		int contador = 0; //variavel que controla as repetições
		
		while(contador <= 20) {
			System.out.printf("i = %d%n", contador);
			contador +=2; //contador acrescenta 2 unidades a cada loop
		}
		
	}
}
