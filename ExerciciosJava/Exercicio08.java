package ExerciciosJava;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/
		
		float custof, custoc;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Valor de fabrica: R$ ");
		custof = teclado.nextFloat();
		
		custoc = (float) (custof + (custof * 0.73));
		
		System.out.printf("Valor de fabrica: R$ %.2f", custof);
		System.out.printf("\nValor para o consumidor: R$ %.2f", custoc);
	}

}
