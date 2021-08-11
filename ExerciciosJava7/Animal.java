package ExerciciosJava7;

public abstract class Animal {
	private String nome;
	private int idade;
	private boolean som;
	private int sexo;
	private boolean correr;
	
	public Animal(String nome, int idade, boolean som, int sexo, boolean correr) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.sexo = sexo;
		this.correr = correr;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String isSom() {
		if(som == true) {
			return "Sim";
		}else {
			return "Não";
		}
	}

	public void setSom(boolean som) {
		this.som = som;
	}

	public String getSexo() {
		if(sexo == 1) {
			return "Fêmea";
		}else {
			return "Macho";
		}
		
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public String isCorrer() {
		if(correr == true) {
			return "Sim";
		}else {
			return "Não";
		}
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	
	public String getCorrer() {
		if(correr == true) {
			return "Sim";
		}else {
			return "Não";
		}
	}
	
	abstract public String produzSom();
}
