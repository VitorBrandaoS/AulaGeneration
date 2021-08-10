package ExerciciosJava5;

import java.text.NumberFormat;

public class Funcionario {
	private String nome;
	private int id;
	private String funcao;
	private int hor;
	private float sal;
	
	public Funcionario(String nome, int id, String funcao, int hor) {
		this.nome = nome;
		this.id = id;
		this.funcao = funcao;
		this.hor = hor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public int getHor() {
		return hor;
	}

	public void setHor(int hor) {
		this.hor = hor;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}
	
	public String pagamento() {
		sal = hor * 25;
		NumberFormat x = NumberFormat.getCurrencyInstance();
		x.setMinimumFractionDigits(2);
		String pagamento = x.format(sal);
		return pagamento;
	}
	public void showFuncionario() {
		System.out.println("\n\t--- Funcionário ---");
		System.out.println("Nome: " + nome + "\nID: " + id + "\nFunção: " + funcao + "\nHoras trabalhadas: "+ hor +"hs\nPagamento: " + this.pagamento()); 
	}
}
