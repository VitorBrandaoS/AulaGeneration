package ExerciciosJava5;

import java.text.NumberFormat;
import java.util.Scanner;

public class contaBancaria {

	private String nome;
	private int cpf;
	private int tipoConta;
	private float dinheiro;
	
	public contaBancaria(String nome, int cpf, int tipoConta, float dinheiro) {
		this.nome = nome;
		this.cpf = cpf;
		this.tipoConta = tipoConta;
		this.dinheiro = dinheiro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}

	public float getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(float dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	public String quant() {
		NumberFormat x = NumberFormat.getCurrencyInstance();
		x.setMinimumFractionDigits(2);
		String moeda = x.format(dinheiro);
		return moeda;
	}
	
	public void deposito() {
		float valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Valor do depósito: R$");
		valor = teclado.nextFloat();
		dinheiro += valor;
	}
	
	public void saque() {
		float valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Valor do saque: R$");
		valor = teclado.nextFloat();
		if(dinheiro >= valor) {
			dinheiro -= valor;
		}else {
			System.out.println("Você não tem dinheiro sulficiente para retirar este valor!\nPor favor confira seu saldo e tente novamente...\nSaldo atual: " + quant());
		}
	}
	private String tipoConta() {
		if(tipoConta == 1) {
			return "Conta Poupaça";
		}else if (tipoConta == 2) {
			return "Conta Salário";
		}else {
			return "Conta Corrente";
		}
	}
	public void infoConta() {
		System.out.println("\n\t---Conta Bancária---\n");
		System.out.println("Nome: " + nome + "\nCPF: " + cpf +"\nTipo de conta: " + tipoConta() + "\nSaldo atual: " + quant());
	}
	
}
