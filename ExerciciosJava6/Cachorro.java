package ExerciciosJava6;

public class Cachorro extends Animal{
	private String raca;
		
	public Cachorro(String nome, int idade, boolean som, String raca, int sexo, boolean correr){
		super(nome, idade, som, sexo, correr);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void infoCao() {
		System.out.println("\n\t--Informa��es do C�o--");
		System.out.println("Nome: " + getNome() 
		+ "\nIdade: " + getIdade() + "\nSexo: " + getSexo()
		+ "\nRa�a: " + getRaca() + "\nDeve emitir som: " + isSom());
	}
}
