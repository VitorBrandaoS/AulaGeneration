package ExerciciosJava2;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
		int num;
		double result;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		num = teclado.nextInt();
		
		if(num == 0) {
			System.out.println("O valor zero é neutro.");
		}
		else if(num % 2 == 0) {
			result = Math.sqrt(num);
			System.out.printf("O valor " + num +" é par!\nE a raiz quadrada de " + num +" é igual á %.2f", result);
		}else {
			result = Math.pow(num, 2);
			System.out.println("O valor " + num + " é ímpar!\nE o valor " + num + " ao quadrado é igual á " + result);
		}
	}

}
