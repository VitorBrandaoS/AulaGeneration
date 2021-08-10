package ExerciciosJava4;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/
		int num[] = new int[6];
		int somaP = 0, quantI = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Digite um valor: ");
			num[i] = teclado.nextInt();
			if(num[i] % 2 == 0) {
				System.out.println("");
			}
		}
		System.out.print("Números pares: ");
		for(int i = 0; i < 6; i++) {
			if(num[i] % 2 == 0) {
				somaP += num[i];				
				System.out.print(num[i] + " - ");				
			}
		}
		System.out.println("A soma dos valores pares é " + somaP);
		System.out.print("\nNúmeros ímpares: ");
		for(int i = 0; i < 6; i++) {
			if(num[i] % 2 != 0) {
				quantI++;
				System.out.print(num[i] + " - ");				
			}
		}
		System.out.println("A quantidade de números ímpares é " + quantI);
 	}

}
