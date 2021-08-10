package ExerciciosJava5;

import java.text.NumberFormat;

public class Patinete {
	private String marca;
	private float preco;
	private boolean eletr;
	private int quant;
	
	
	public Patinete(String marca, float preco, boolean eletr,int quant) {
		this.marca = marca;
		this.preco = preco;
		this.eletr = eletr;
		this.quant = quant;		
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public boolean isEletr() {
		return eletr;
	}


	public void setEletr(boolean eletr) {
		this.eletr = eletr;
	}


	public int getQuant() {
		return quant;
	}


	public void setQuant(int quant) {
		this.quant = quant;
	}
	
	public String eletrico() {
		if(eletr == true) {
			 return "Sim";
		}else {
			return "Não";
		}
	}
	
	public String valor() {
		NumberFormat x = NumberFormat.getCurrencyInstance();
		x.setMinimumFractionDigits(2);
		String valor = x.format(preco);
		return valor;
	}
	
	public void infoPatinete() {
		System.out.println("\n-------------------------------\n");
		System.out.println("Marca: " + marca + "\nPreço: " + valor() + "\nEletrico? " + eletrico() + "\nQuantidade em estoque: " + quant);
	}
	
}
