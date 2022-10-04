package poo;

public class Cachorro extends Animal {

	public Cachorro() {}

	public Cachorro(String nome, String raca, Float comprimento, Integer patas, String ecossistema, String cor) {
		super.setNome(nome);
		super.setRaca(raca);
		super.setComprimento(comprimento);
		super.setPatas(patas);
		super.setEcossistema(ecossistema);
		super.setCor(cor);
	}

	public static void late() {
		System.out.println("Au Au!!");
	}

}
