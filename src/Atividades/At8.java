package Atividades;

public class At8 {

	public static void main(String[] args) {
		String[] texto = new String[10];
		int i, tamanho;
		
		for (i = 0; i < 10; i++) {
			texto[i] = ("Aqui tem algo" + " " + i);
		}
		for (i = 0; i < 10; i++) {
			System.out.println(texto[i]);
		}
		for (i = 0; i < 10; i++) {
			if (texto[i] == null) {
				System.out.println("Esta vazia");//Como aqui ja foi atribuído valor a elas, não terá retorno no console
			}
		}
		tamanho = texto.length;
		System.out.println("Tamanho do Array" + " " + tamanho);
		System.out.println("O ultimo array tem valor de: '" + texto[9] + "'");
	}
}
