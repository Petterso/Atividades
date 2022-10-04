package poo;

public class Gato extends Animal {
	
	public Gato() {}

	public Gato(String nome,String raca,Float comprimento,Integer patas,String ecossistema, String cor ) {
		super.setNome(nome);
		super.setRaca(raca);
		super.setComprimento(comprimento);
		super.setPatas(patas);
		super.setEcossistema(ecossistema);
		super.setCor(cor);
	}
	
	public static void mia() {
		System.out.println("Miau");
	}

}
