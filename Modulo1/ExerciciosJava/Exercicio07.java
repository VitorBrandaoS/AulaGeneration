package ExerciciosJava;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*7. Um sistema de equações lineares do tipo:
		 Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.*/
		
		double a, b, c, d, e, f, x, y;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Valor de A: ");
		a = teclado.nextDouble();
		System.out.println("Valor de B: ");
		b = teclado.nextDouble();
		System.out.println("Valor de C: ");
		c = teclado.nextDouble();
		System.out.println("Valor de D: ");
		d = teclado.nextDouble();
		System.out.println("Valor de E: ");
		e = teclado.nextDouble();
		System.out.println("Valor de F: ");
		f = teclado.nextDouble();
		
		x = (((c*e) - (b*f)) / ((a*e) - (b*d)));
		y = (((a*f) - (c*d)) / ((a*e) - (b*d)));
		
		System.out.println("O valor de X: " + x + "\nO valor de Y: " + y);
	}

}
