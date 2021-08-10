package ExerciciosJava;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*6. Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula*/
		
		double x1, x2, y1, y2, d;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Valor de x1: ");
		x1 = teclado.nextDouble();
		System.out.println("Valor de x2: ");
		x2 = teclado.nextDouble();
		System.out.println("Valor de y1: ");
		y1 = teclado.nextDouble();
		System.out.println("Valor de y2: ");
		y2 = teclado.nextDouble();
		
		d = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1, 2));
		
		System.out.printf("O resultado é %.2f" , d);
		
		
	}

}
