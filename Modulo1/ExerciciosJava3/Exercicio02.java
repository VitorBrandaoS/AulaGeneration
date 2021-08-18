package ExerciciosJava3;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
		
		int num, impar = 0, par = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i <= 9; i++) {
			System.out.println("Entre com um valor: ");
			num = teclado.nextInt();
			if(num % 2 == 0) {
				par ++;
			}else {
				impar++;
			}
		}
		System.out.println("Temos " + par + " números Pares e " + impar + " números Ímpares!");
	}
}
