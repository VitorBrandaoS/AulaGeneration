programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/
		inteiro dado[10], total, i, maior = 0, cont = 0
		real media = 0.0

		para(i = 0; i < 10; i++){
			dado[i] = Util.sorteia(1, 6)
			media += dado[i]
			escreva("\nLançamento: ", i + 1, " Resultado: ", dado[i])

			se (maior < dado[i]){
				maior = dado[i]
				cont = 0
			}
			se(maior == dado[i]){
				cont++
			}			
		} 
		escreva("\nO valor ", maior, " repetiu ", cont, " vezes!")
		media = media / 10
		escreva("\nA média dos valores dos lançamentos foi: ", media)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 661; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */