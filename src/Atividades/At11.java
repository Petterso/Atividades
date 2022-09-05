package Atividades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class At11 {

	public static void main(String[] args) {
		ArrayList<Float> salario = new ArrayList<Float>(100);
		float maior=0,menor=5000,media=0;
		int i;
		Random aleatorio = new Random();
		
		for (i = 0; i < 100; i++) {
			Float a = 1000+aleatorio.nextFloat(4000);
			salario.add(i, a);
			if(a>maior) {
				maior=a;
			}
			if(a<menor) {
				menor=a;
			}
			media=media+a;
		}
		for(i=0;i<100;i++) {
			System.out.printf("%.2f\n",salario.get(i));
		}
		System.out.printf("O menor salario é : %.2f \nO maior salário é: %.2f\nA média dos salários é : %.2f ",menor,maior,media/100);
	}
}
