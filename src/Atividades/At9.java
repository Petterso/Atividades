package Atividades;

import java.util.ArrayList;
import java.util.List;

public class At9 {

	public static void main(String[] args) {
		// como na questão não pediu para atribuir valores a lista estará vazia
		ArrayList<String> texto = new ArrayList<String>(10);
		int i;
		for (i = 0; i < 10; i++) {
			texto.add(i, null);
		}
		for (i = 0; i < 10; i++) {
			if (texto.get(i) == null) {
				System.out.println("Espaço da lista na posição: " + i + " está vazio");
			}
		}
		System.out.println("O ultimo valor é igual a: "+texto.get(9));
		
	}
}
