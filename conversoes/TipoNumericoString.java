package conversoes;

public class TipoNumericoString {
	public static void main(String[] args) {
		
	
	Integer num1 = 10000;
	System.out.println(num1.toString().length()); //só consigo ver o tamanho do numero pq agora é uma string.
	
	int num2 = 100000;
	System.out.println(Integer.toString(num2)); //passei o int para wrapper Integer e converti para String.
	System.out.println("Tamanho da String: "+Integer.toString(num2).length()); //agora apresentei o tamanho da String
	
	
	//gambiara para converter, pois assim o java reconhece que é uma string agora. NÃO RECOMENDADO
	System.out.println(("" + num1).length());
	System.out.println(("" + num2).length());
	}
}
