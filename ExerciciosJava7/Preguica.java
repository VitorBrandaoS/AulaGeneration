package ExerciciosJava7;

public class Preguica extends Animal {
	private boolean sobeArv;
	
	public Preguica(String nome, int idade, boolean som, int sexo, boolean correr, boolean sobeArv) {
		super(nome, idade, som, sexo, correr);
		this.sobeArv = sobeArv;
	}

	public String isSobeArv() {
		if(sobeArv == true) {
			return "Sim";
		}else {
			return "N�o";
		}
	}

	public void setSobeArv(boolean sobeArv) {
		this.sobeArv = sobeArv;
	}
	
	public void infoPreguica() {
		System.out.println("\n\t--Informa��es da Pregui�a--");
		System.out.println("Nome: " + getNome() 
		+ "\nIdade: " + getIdade() + "\nSexo: " + getSexo()
		+ "\nSobe em arvore? " + isSobeArv() + "\n" + produzSom());
	}
	
	public String produzSom() {
		if(isSom() == "Sim") {
			return isSom()+", esta pregui�a produz som ao se sentir amea�ada!";
		}else {
			return isSom()+", esta pregui�a n�o produz som ao se sentir amea�ada...";
		}
	}
}
