package ExerciciosJava2;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
		int num;
		double result;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		num = teclado.nextInt();
		
		if(num == 0) {
			System.out.println("O valor zero � neutro.");
		}
		else if(num % 2 == 0) {
			result = Math.sqrt(num);
			System.out.printf("O valor " + num +" � par!\nE a raiz quadrada de " + num +" � igual � %.2f", result);
		}else {
			result = Math.pow(num, 2);
			System.out.println("O valor " + num + " � �mpar!\nE o valor " + num + " ao quadrado � igual � " + result);
		}
	}

}
