package ExerciciosJava4;

import java.util.Random;

public class Exercicio03 {
	public static void main(String[] args) {
		/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
		
		int num [][] = new int[3][3];
		
		Random gerador = new Random();
		System.out.print("Números maiores que 10:\n ");
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				num[x][y] = gerador.nextInt(20);
				if(num[x][y] > 10) {
					System.out.print(num[x][y] + " ");
				}
			}
		}
	}
}
