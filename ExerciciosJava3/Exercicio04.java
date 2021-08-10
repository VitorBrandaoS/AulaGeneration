package ExerciciosJava3;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		int idade, cont = 0, a, b, ho = 0, mulh = 0, out = 0, calm = 0, nerv = 0, agre = 0, calmOut = 0, nerv40 = 0, calmJov = 0, mulhNerv = 0, hoAgre = 0;
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		while(cont <= 150) {
			System.out.println("Nome: ");
			nome = teclado.nextLine();
			System.out.println("Idade: ");
			idade = teclado.nextInt();
			System.out.println("Sexo:\n1 - Feminino\n2 - Mascuslino\n3 - Outros\n");
			a = teclado.nextInt();
			
			switch(a){
				case 1: 
					mulh++;
					break;
				case 2:
					ho++;
					break;
				case 3:
					out++; 
					break;
				default:
					System.out.println("Valor inválido!");
					break;
			}
			System.out.println("Temperamento:\n1 - Calma\n2 - Nervosa\n3 - Agressiva\n");
			b = teclado.nextInt();
			switch(b){
				case 1: 
					calm++;
					break;
				case 2:
					nerv++;
					break;
				case 3:
					agre++;
					break;
				default:
					System.out.println("Valor inválido!");
					break;
			}
			if(a == 1 && b == 2) {
				mulhNerv++;
			}
			if(a == 2 && b == 3) {
				hoAgre++;
			}
			if(a == 3 && b == 1) {
				calmOut++;
			}
			if(b == 2 && idade > 40) {
				nerv40++;
			}
			if(b == 1 && idade < 18) {
				calmJov++;
			}
			teclado.nextLine();
			cont++;
		}
		System.out.println("Número de pessoas calmas: " + calm + "\nNúmero de mulheres nervoras: " + mulhNerv + "\nNúmero de homens agressivos: " + hoAgre + "\nNúmero de Outros calmos: " + calmOut + "\nNúmero de pessoas nervosas com mais de 40 anos: " + nerv40 + "\nNúmero de pessoas calmas com menos de 18 anos: " + calmJov);
	}
}
