package ExerciciosJava4;

public class Exercicio01 {

	public static void main(String[] args) {
		/*1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/
		int soma;
		int num[] = {1, 0, 5, -2, -5, -7};
		/*int num[] = new int[6];
		num[0] = 1;
		num[1] = 0;
		num[2] = 5;
		num[3] = -2;
		num[4] = -5;
		num[5] = 7;*/
		
		soma = num[0] + num[1] + num[5];
		System.out.println("Soma entre os valores:\nA[0]: " + num[0] + " A[1]: " + num[1] + " A[5]: " + num[5] + " = " + soma + "\n------------------");
		num[4] = 100;
		 for(int i = 0; i < 6; i++) {
			System.out.println("A[" + i + "] = " + num[i]);
		/*for(int i : num) {
			System.out.println("A[" + i + "] = " + num[i]);*/
		}
		
	}

}
