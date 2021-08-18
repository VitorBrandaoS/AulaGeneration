package ExerciciosJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
		
		int valor, mes, dia, ano;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantos dias de vida você tem? ");
		valor = teclado.nextInt();
		
		ano = valor / 365;
		mes = (valor % 365) / 30;
		dia = (valor % 365) % 30;
		
		System.out.println("Você tem " + ano + " ano(s), " + mes + " mes(es) e " + dia + " dias de vida!");
	}

}
