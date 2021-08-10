package ExerciciosJava5;

import java.text.NumberFormat;

public class ProdutoEletronico {
	private String tipo;
	private String nome;
	private float preco;
	private int quant;
	
	public ProdutoEletronico(String t, String n, float p, int q) {
		this.tipo = t;
		this.nome = n;
		this.preco = p;
		this.quant = q;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}
	
	public String moeda() {
		NumberFormat x = NumberFormat.getCurrencyInstance();
		x.setMinimumFractionDigits(2);
		String moeda = x.format(preco);
		return moeda;
	}
	
	public void imprimeEletro() {
		System.out.println("\n\t---Produto---");
		System.out.println("Tipo do produto: " + tipo + "\nNome do produto: " + nome + "\nPreço: " + this.moeda() + "\nQuantidade Estoque: " + quant); 
	}
	
}
