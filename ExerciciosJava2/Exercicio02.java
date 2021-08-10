package ExerciciosJava2;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		/*Faça um programa que entre com três números e coloque em ordem crescente.*/
		
		int num1, num2, num3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		num1 = teclado.nextInt();
		System.out.println("Digite outro valor: ");
		num2 = teclado.nextInt();
		System.out.println("Digite outro valor: ");
		num3 = teclado.nextInt();
		
		System.out.print("Organizado em ordem crescente: ");
		if(num1 <= num2 && num1 <= num3){
			System.out.print(num1 + " - ");
			if(num2 <= num3) {
				System.out.println(num2 + " - " + num3);
			}else {
				System.out.println(num3 + " - " + num2 + ".");
			}
		}
		else if(num2 <= num1 && num2 <= num3){
			System.out.print(num2 + " - ");
			if(num1 <= num3) {
				System.out.println(num1 + " - " + num3);
			}else {
				System.out.println(num3 + " - " + num1 + ".");
			}
		}
		else if(num3 <= num1 && num3 <= num2){
			System.out.print(num3 + " - ");
			if(num1 <= num2) {
				System.out.println(num1 + " - " + num2);
			}else {
				System.out.println(num2 + " - " + num1 + ".");
			}
		}
	}
}
