package controller;

public class MenorValorController {

	public MenorValorController() {
		super();
	}

	public int MenorValor(int [] vet, int tamanho, int UltimaPosicao) {
		//Condição de parada: se o tamanho for 0, retorna o menor valor encontrado, que está na última posição
		if (tamanho == 0) {
		return UltimaPosicao;
		} 
		
		//Se o valor atual for menor que o valor da última posição, atualiza-se a última posição para o menor valor
		if (vet[tamanho - 1] < UltimaPosicao) {
			UltimaPosicao = vet[tamanho - 1];
		}
		return MenorValor(vet, tamanho - 1, UltimaPosicao);
	}
	
}
