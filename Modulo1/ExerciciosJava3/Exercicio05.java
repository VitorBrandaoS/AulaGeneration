package ExerciciosJava3;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
		int num, soma = 0;
		
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Digite um valor: ");
			num = teclado.nextInt();
			soma += num;
		}while(num != 0);
		
		System.out.println("A soma dos valores digitados � igual � " + soma + ".");
		
	}

}
