package Atividades;

import java.util.Scanner;

public class At3 {

	public static boolean valida(Double a, Double b) {
		if (a == 0 || b == 0) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		double precoLitroPrimitivo = 0, quantidadeLitroPrimitivo = 0;
		Scanner leitura = new Scanner(System.in);
		Double precoLitro = Double.valueOf(precoLitroPrimitivo);
		Double quantidadeLitro = Double.valueOf(quantidadeLitroPrimitivo);
		System.out.println("Digite o valor de litro e depois a quantidade de litros de combustivel");
		precoLitro = leitura.nextDouble();
		quantidadeLitro = leitura.nextDouble();
		
		if (valida(precoLitro, quantidadeLitro)) {
			System.out.println(precoLitro * quantidadeLitro);
		} else {
			System.out.println("Pelo menos um dos valores não é válido");
		}
		leitura.close();
	}
}