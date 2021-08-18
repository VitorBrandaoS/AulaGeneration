package ExerciciosJava3;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
		
		int num, soma = 0, cont = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("0 - Encerra o programa.\nDigite um valor: ");
			num = teclado.nextInt();
			if(num % 3 == 0 && num != 0) {
				soma += num;
				cont++;
			}
		}while(num != 0);
		
		if(cont == 0){
			System.out.println("A média dos números múltiplos de 3 é igual á 0");
		}else {
			soma = soma / cont;
			System.out.println("A média dos números múltiplos de 3 é igual á "+ soma);
		}
	}

}
