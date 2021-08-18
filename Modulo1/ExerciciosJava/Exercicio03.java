package ExerciciosJava;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main (String[] args) {
		/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
		
		int tempo, hor, min, seg;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quanto segundos o evento vai durar? ");
		tempo = teclado.nextInt();
		
		hor = tempo / 3600;
		min = (tempo % 3600) / 60;
		seg = (tempo % 3600) % 60;
		
		System.out.println("Este evento irá durar " + hor + "hrs, " + min + " min e " + seg + " seg.");
	}
	
}
