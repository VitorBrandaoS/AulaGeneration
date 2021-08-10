package ExerciciosJava5;

import java.util.Scanner;

public class Cliente {
	
	private String nome;
	private int idade;
	private int sexo;
	
	public Cliente (String n, int i, int sex) {
		this.nome = n;
		this.idade = i;
		this.sexo = sex;
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

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	
	public void cadastro() {
		//String nome;
		//int idade, sexo;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("\n\t---Cadastro Cliente---");	
		System.out.println("Nome: ");
		nome = teclado.nextLine();
		System.out.println("Idade: ");
		idade = teclado.nextInt();
		
		do {			
			System.out.println("Sexo:\n1-Feminino\n2-Masculino\n3-Outros ");
			sexo = teclado.nextInt();
			
			if(sexo < 1 || sexo > 3){
				System.out.println("\t---ERRO---\nPor favor tente novamente.");
			}
			
		}while(sexo < 1 || sexo > 3);
		
	}
	
	public void imprimir() {
		System.out.println("\t---Cliente---\n ");
		System.out.println("Nome: " + nome 
				+ "\nIdade: " + idade);
		if(sexo == 1) {
			System.out.println("Sexo: Feminino");
		}
		if(sexo == 2) {
			System.out.println("Sexo: Masculino");
		}
		if(sexo == 3) {
			System.out.println("Sexo: Outros");
		}
	}
	
}
