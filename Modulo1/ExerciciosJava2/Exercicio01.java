package ExerciciosJava2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/
		
		int num1, num2, num3, maior = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		num1 = teclado.nextInt();
		System.out.println("Digite outro valor: ");
		num2 = teclado.nextInt();
		System.out.println("Digite outro valor: ");
		num3 = teclado.nextInt();
		
		if(maior < num1) {
			maior = num1;
		}
		if(maior < num2) {
			maior = num2;
		}
		if(maior < num3) {
			maior = num3;
		}
		
		System.out.println("O maior valor entre: " + num1 + ", " + num2 + ", "+ num3 +" é " + maior);
	}
}
