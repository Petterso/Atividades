package Atividades;
public class At4 {

	public static void main(String[] args) {
		String a, b;
		a="carro";
		b="carro";
		if(a==b) {
			System.out.println("São equivalentes usando comparador ==");
		}
		if(a.equals(b) ) {
			System.out.println("São equivalentes usando equals ");
		}
		if(a.equalsIgnoreCase(b)) {
			System.out.println("São equivalentes usando equals ignore Case ");
		}
	}
}
