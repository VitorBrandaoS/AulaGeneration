package ExerciciosJava4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
*/
		double a[][] = new double[2][2];
		double b[][] = new double[2][2];
		double c[][] = new double[2][2];
		int entrada;
		
		Random gerador = new Random();
		Scanner teclado = new Scanner(System.in);
		
		for(int x = 0; x < 2; x++) {
			for(int y = 0; y < 2; y++) {
				a[x][y] = gerador.nextDouble() * 50;
				b[x][y] = gerador.nextDouble() * 50;
			}
		}
		
		do {
			System.out.println("\t--Menu--\n1-Somar as duas matrizes.\n2-Subtrair a primeira matriz da segunda.\n3-Adicionar uma constante as duas matrizes.\n4-Imprimir as matrizes.\n0-Encerrar o programa.");
			entrada = teclado.nextInt();
			System.out.println("\n");
			if(entrada != 0) {
				switch(entrada) {
					case 1:
						for(int x = 0; x < 2; x++) {
							for(int y = 0; y < 2; y++) {
								c[x][y] = a[x][y] + b[x][y];
								System.out.printf("A[%d][%d]: %.2f + B[%d][%d]: %.2f = %.2f\n", x, y, a[x][y], x, y, b[x][y], c[x][y]);
							}
						}
						break;
					case 2:
						for(int x = 0; x < 2; x++) {
							for(int y = 0; y < 2; y++) {
								c[x][y] = a[x][y] - b[x][y];
								System.out.printf("A[%d][%d]: %.2f - B[%d][%d]: %.2f = %.2f\n", x, y, a[x][y], x, y, b[x][y], c[x][y]);
							}
						}
						break;
					case 3:
						System.out.println("Digite um valor para substituir todos valores da matriz: ");
						int num = teclado.nextInt();
						System.out.println("Matriz: \n");
						for(int x = 0; x < 2; x++) {
							System.out.println();
							for(int y = 0; y < 2; y++) {
								c[x][y] = num;
								System.out.printf("C[%d][%d]: %.2f\t", x, y, c[x][y]);
							}
						}
						break;
					case 4:
						System.out.println("Matriz A: ");
						for(int x = 0; x < 2; x++) {
							System.out.println();
							for(int y = 0; y < 2; y++) {
								System.out.printf("A[%d][%d]: %.2f\t", x, y, a[x][y]);
						
							}
						}
						System.out.println("\n\nMatriz B: ");
						for(int x = 0; x < 2; x++) {
							System.out.println();
							for(int y = 0; y < 2; y++) {
								System.out.printf("B[%d][%d]: %.2f\t", x, y, b[x][y]);
							}
						}
						break;
					default:
						System.out.println("Entrada invalida! Por favor tente novamente.");
				}
				System.out.println("\n");
			}
		}while(entrada != 0);
		System.out.println("\nPrograma encerrado!");
	}

}
