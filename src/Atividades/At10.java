package Atividades;

public class At10 {

	public static void main(String[] args) {
		String[] biomas = new String[6];
		int i;
		biomas[0]="Amazônia";
		biomas[1]="Mata Atlântica";
		biomas[2]="Cerrado";
		biomas[3]="Caatinga”";
		biomas[4]="Pampa";
		biomas[5]="Pantanal";
		biomas[3]=null;
		for(i=0;i<6;i++) {
			if(biomas[i]!=null) {
				System.out.println(biomas[i]);
			}
		}
	}
}
