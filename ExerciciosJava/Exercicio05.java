package ExerciciosJava;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/
		
		float nota1, nota2, nota3, mediaP;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a primira nota: ");
		nota1 = teclado.nextFloat();
		System.out.println("Digite a segunda nota: ");
		nota2 = teclado.nextFloat();
		System.out.println("Digite a terceira nota: ");
		nota3 = teclado.nextFloat();
		
		mediaP = ((nota1*2) + (nota2*3) + (nota3*5)) / 10;
		
		System.out.println("A média ponderada é igual a " + mediaP);
		
	}
	

}
