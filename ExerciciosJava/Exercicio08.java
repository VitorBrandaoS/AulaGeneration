package ExerciciosJava;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
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
