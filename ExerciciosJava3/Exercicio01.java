package ExerciciosJava3;

public class Exercicio01 {

	public static void main(String[] args) {
		/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/
		System.out.println("Os valores entre 1000 e 1999 que divididos por 11 tem o resto da divisão igual 5 são:");
		for(int x = 1000; x <= 1999; x++ ) {
			if(x % 11 == 5){
				if(x > 1995) {
					System.out.print(x + ".");
				}else {
					System.out.print(x + " - ");
				}
			}
		}

	}

}
