package ExerciciosJava4;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
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
		System.out.print("N�meros pares: ");
		for(int i = 0; i < 6; i++) {
			if(num[i] % 2 == 0) {
				somaP += num[i];				
				System.out.print(num[i] + " - ");				
			}
		}
		System.out.println("A soma dos valores pares � " + somaP);
		System.out.print("\nN�meros �mpares: ");
		for(int i = 0; i < 6; i++) {
			if(num[i] % 2 != 0) {
				quantI++;
				System.out.print(num[i] + " - ");				
			}
		}
		System.out.println("A quantidade de n�meros �mpares � " + quantI);
 	}

}
