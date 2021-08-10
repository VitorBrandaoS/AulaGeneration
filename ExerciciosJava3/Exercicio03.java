package ExerciciosJava3;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
		
		int idade = 0, maior = 0, menor = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		while(idade != -99) {
			System.out.println("Digite sua idade: ");
			idade = teclado.nextInt();
			
			if(idade < 21 && idade > 0) {
				menor++;
			}
			else if(idade > 50) {
				maior++;
			}
		}
		System.out.println("Menores de 21 anos: " + menor + "\nMaiores de 50 anos: " + maior);
		
	}
}
