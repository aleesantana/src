package wrappers;
//wrappers são as versoes orientadas a objeto dos tipos primitivos. Só muda a primeira letra e
//int é Integer e Char é Character
//https://www.devmedia.com.br/wrappers-em-java-aprenda-como-utilizar/30275#:~:text=Wrappers%20vem%20do%20verbo%20ingl%C3%AAs,coisas%E2%80%9D%20adicionando%20funcionalidades%20%C3%A0%20ela.

import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		//byte
		Byte b = 100;
		Short s = 1000;
			
		//Integer.parseInt(entrada.next());
		Integer i = 10000; //int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c.toString());
		
		entrada.close();
		
	}
}
