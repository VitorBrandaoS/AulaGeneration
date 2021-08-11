package ExerciciosJava7;

public class Cavalo extends Animal {
	
	private boolean malhado;
	private double velocidade;
	public Cavalo(String nome, int idade, boolean som, boolean malhado, int sexo, boolean correr, double velocidade){
		super(nome, idade, som, sexo, correr);
		this.malhado = malhado;
		this.velocidade = velocidade;
	}
	public String isMalhado() {
		if(malhado == true) {
			return "Sim";
		}else {
			return "Não";
		}
	}
	public void setMalhado(boolean malhado) {
		this.malhado = malhado;
	}
	public String getVelocidade() {
		return velocidade + "km/h";
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public void infoCavalo() {
		System.out.println("\n\t--Informações do Cavalo--");
		System.out.println("Nome: " + getNome() 
		+ "\nIdade: " + getIdade() + "\nSexo: " + getSexo()
		+ "\nÉ malhado? " + isMalhado() + "\nVelocidade: "+ getVelocidade() +  "\n" + produzSom());
	}
	
	public String produzSom() {
		if(isSom() == "Sim") {
			return isSom()+", este cavalo relincha!";
		}else {
			return isSom()+", este cavalo não relincha ;-;";
		}
	}
}
