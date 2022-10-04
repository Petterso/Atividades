package poo;

public class Programa {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		gato.setPatas(4);
		cachorro.setPatas(5);
	System.out.println("Cachorro tem "+cachorro.getPatas()+"patas");
	System.out.println("gato tem "+gato.getPatas()+"patas");
	}

}
