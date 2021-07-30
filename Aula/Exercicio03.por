programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/

		inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6], x, y

		para(x = 0; x < 4; x++){
			para(y = 0; y < 6; y++){
				n1 [x][y] =  Util.sorteia(0, 50)
				n2 [x][y] =  Util.sorteia(0, 50)
			}
		}
		/*para(x = 0; x < 4; x++){
			para(y = 0; y < 6; y++){
				n2 [x][y] =  Util.sorteia(0, 50)
			}
		}*/
		para(x = 0; x < 4; x++){
			para(y = 0; y < 6; y++){
				m1 [x][y] = (n1[x][y] + n2[x][y])
				m2 [x][y] = (n1[x][y] - n2[x][y])
				escreva("\n", n1[x][y], " + ", n2[x][y], " = ", m1[x][y])
				escreva(" / ", n1[x][y], " - ", n2[x][y], " = ", m2[x][y])
			}
		}
		/*para(x = 0; x < 4; x++){
			para(y = 0; y < 6; y++){
				m2 [x][y] = (n1[x][y] - n2[x][y])
			}
		}*/
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 854; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 13, 10, 2}-{n2, 13, 20, 2}-{m1, 13, 30, 2}-{m2, 13, 40, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */