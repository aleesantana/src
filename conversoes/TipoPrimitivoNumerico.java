package conversoes;

public class TipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; //coners�o impl�cita
		System.out.println(a);
		
		float b = (float) 1.12345548856963; //convers�o explicita (CAST)
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c; //convers�o explicita (CAST) - byte � menor, ent�o o java converte o 130 p o menor poss�vel at� 127 (m�sximo do byte)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;
		System.out.println(f);
	}
}
