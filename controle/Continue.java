package controle;

public class Continue {
	public static void main(String[] args) {
		
		//N�MEROS PARES  DE 0 A 20
		for (int i = 0; i < 20; i++) {
			if(i % 2 ==1) {
				continue;
			}
			System.out.println("N�mero par: "+i);
		}
		
		//TODOS OS N�MEROS DE 1 A 10, EXCETO O 5 e 9.
		for (int i = 1; i <= 10; i++ ) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
