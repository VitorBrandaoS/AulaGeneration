package ExerciciosJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
	public static void main(String[] args) {
		int esc;
		String cap;
		Scanner teclado = new Scanner(System.in);
		List<String> estoque = new ArrayList<String>();
		
		do {
			System.out.println("\n============ Menu Estoque ============");
			System.out.println("1-Armazenar produto no estoque\n2-Remover produto do estoque\n3-Atualizar produto no estoque\n4-Ver estoque\n0-Encerrar Programa");
			esc = teclado.nextInt();
			switch(esc) {
			case 1:
				teclado.nextLine();
				System.out.println("\n============ Armazenar ============");
				System.out.println("Qual produto irá armazenar? ");
				String prod = teclado.nextLine();
				estoque.add(prod);
				System.out.println("Produto "+prod+" adicionado com sucesso!");
				break;
				
			case 2:
				teclado.nextLine();
				System.out.println("\n============ Remover ============");
				System.out.println("Qual produto gostaria de remover? ");
				prod = teclado.nextLine();
						
				if(estoque.contains(prod)) {
					estoque.remove(prod);
					System.out.println("Produto "+prod+" removido com sucesso!");
					System.out.println("\n\t--Estoque Atual--\n"+estoque);
				}else {
					System.err.println("Opá! O produto "+prod+" não foi encontrado no seu estoque.\nPor favor tente novamente.");
					System.out.println("\n\t--Estoque Atual--\n"+estoque);
				}
				break;
			case 3:
				teclado.nextLine();
				System.out.println("\n============ Atualizar ============");
				System.out.println("Qual produto gostaria de atualizar? ");
				prod = teclado.nextLine();
						
				if(estoque.contains(prod)) {
					estoque.remove(prod);
					System.out.println("Qual o produto entrará no lugar deste? ");
					String novoProd = teclado.nextLine();
					estoque.add(novoProd);
					System.out.println("Produto "+prod+" removido com sucesso! E o novo produto " +novoProd+ " foi armazenado em seu lugar.");
					System.out.println("\n\t--Estoque Atual--\n"+estoque);
				}else {
					System.err.println("Opá! O produto "+prod+" não foi encontrado no seu estoque.\nPor favor tente novamente.");
					System.out.println("\n\t--Estoque Atual--\n"+estoque);
				}
				break;
			case 4:
				System.out.println("\n============ Estoque atual ============");
				System.out.println(estoque);
				break;
				default:
					if(esc != 0) {
						System.err.println("\nOpição inválida!");
					}else {
						System.out.println("Programa Finalizado!");
					}
			}
			
		}while(esc != 0);
		
	}
}
