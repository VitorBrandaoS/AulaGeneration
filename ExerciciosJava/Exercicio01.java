package ExerciciosJava;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
		
		int idade, dia, mes;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = teclado.nextInt();
		mes = (idade * 365) / 30;
		dia = (idade * 365);
		
		System.out.println("Você tem " + dia + " dias de vida!");
		/*System.out.println("Meses: " + mes + "\nDias: " + dia);*/
	}

}
