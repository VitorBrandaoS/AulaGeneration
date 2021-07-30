programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

		inteiro num[3][3], x, y, soma = 0, somaD = 0, n

		para(x = 0; x < 3; x++){
			para(y = 0; y < 3; y++){
				//escreva("\nDigite um valor: ") 
				//leia(num[x][y])
				num [x][y] = Util.sorteia(0, 100)
				soma += num[x][y] //soma = soma + num[x][y]				
			}
		}
		escreva("\nA soma de todos valores da matriz é: ")
		para(x = 0; x < 3; x++){
			escreva("\n")
			para(y = 0; y < 3; y++){
				se(x == 2 e y == 2){
					soma += num[x][y]
					escreva(num[x][y], " | \nTotal = ", soma)						
				}senao{
					soma += num[x][y]
					escreva(num[x][y], " | ")
				}
				
			}
		}
		escreva("\nA soma dos valores na diagonal é: ")
		para(x = 0; x < 3; x++){
			para(y = 0; y < 3; y++){
				se(x == y){
					se(x == 2 e y == 2){
						somaD += num[x][y]
						escreva(num[x][y], " = ", somaD)						
					}senao{
						somaD += num[x][y]
						escreva(num[x][y], " + ")
					}
				}
			}
		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 736; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */