package ExerciciosJava;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:*/
		
		int a, b, c, d;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Valor de A: ");
		a = teclado.nextInt();
		
		System.out.println("Valor de B: ");		
		b = teclado.nextInt();
		
		System.out.println("Valor de C: ");		
		c = teclado.nextInt();
		
		d = (int) (Math.pow(a + b, 2) + Math.pow(b + c,2)) / 2;
		
		System.out.println("O resultado da equação é " + d);
	}

}
