package view;

import controller.MenorValorController;

public class Principal {

	public static void main(String[] args) {
		
		MenorValorController menorValorController = new MenorValorController();	

		int [] vet = {4, 2, 8, 9, 3, 14};
		int tamanho = 6;
		int UltimaPosicao = menorValorController.MenorValor(vet, tamanho, vet[tamanho - 1]);
		System.out.println("O menor valor do vetor é: " + UltimaPosicao);
	}

}
