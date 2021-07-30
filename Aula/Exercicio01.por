programa
{
	
	funcao inicio()
	{
		/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
		real num[5], maior = 0.0
		inteiro i

		para(i = 0; i < 5; i ++){
			escreva("\nPontuação candidato ", i + 1," : ")
			leia(num[i])
			se (maior < num[i]){
				maior = num[i]	
			}
		}
		limpa()
		para(i = 0; i < 5; i ++){
			escreva("\nCandidato: ", i + 1, " Pontuação: ", num[i])
		}
		escreva("\nA maior pontuação foi: ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 496; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */