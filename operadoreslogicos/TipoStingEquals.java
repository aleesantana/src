package operadoreslogicos;

import java.util.Scanner;

public class TipoStingEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner op = new Scanner(System.in);
		
		String s2 = op.nextLine();
		System.out.println("2" == s2.trim()); //trim desconsidera os espaços em branco
		System.out.println("2".equals(s2));
		
		op.close();
		
	}
}
