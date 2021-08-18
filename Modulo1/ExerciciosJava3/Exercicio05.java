package ExerciciosJava3;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
		int num, soma = 0;
		
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Digite um valor: ");
			num = teclado.nextInt();
			soma += num;
		}while(num != 0);
		
		System.out.println("A soma dos valores digitados é igual á " + soma + ".");
		
	}

}
