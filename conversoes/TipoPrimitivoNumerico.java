package conversoes;

public class TipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; //conersão implícita
		System.out.println(a);
		
		float b = (float) 1.12345548856963; //conversão explicita (CAST)
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c; //conversão explicita (CAST) - byte é menor, então o java converte o 130 p o menor possível até 127 (m´sximo do byte)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;
		System.out.println(f);
	}
}
