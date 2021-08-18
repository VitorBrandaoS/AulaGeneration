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
			return "Não";
		}
	}

	public void setSobeArv(boolean sobeArv) {
		this.sobeArv = sobeArv;
	}
	
	public void infoPreguica() {
		System.out.println("\n\t--Informações da Preguiça--");
		System.out.println("Nome: " + getNome() 
		+ "\nIdade: " + getIdade() + "\nSexo: " + getSexo()
		+ "\nSobe em arvore? " + isSobeArv() + "\n" + produzSom());
	}
	
	public String produzSom() {
		if(isSom() == "Sim") {
			return isSom()+", esta preguiça produz som ao se sentir ameaçada!";
		}else {
			return isSom()+", esta preguiça não produz som ao se sentir ameaçada...";
		}
	}
}
