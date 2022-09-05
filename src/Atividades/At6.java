package Atividades;

import java.util.Arrays;
import java.util.Scanner;

public class At6 {

	public static void main(String[] args) {
		double[] salario = new double[10];
		int i;
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite o valor dos 10 salarios");
		for (i = 0; i < 10; i++) {
			salario[i] = leitura.nextDouble();
		}
		Arrays.sort(salario);
		for (i = 0; i < 10; i++) {
			System.out.println(salario[i]);
		}
		System.out.println("Agora crescente");
		for (i = 9; i > -1; i--) {
			System.out.println(salario[i]);
		}
		leitura.close();
	}
}
