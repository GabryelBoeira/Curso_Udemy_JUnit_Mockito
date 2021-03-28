package com.br.gabryel.livraria;

public class LivrariaMain {

	public static void main(String[] args) {

		PilhaTest teste = new PilhaTest();

//		System.out.println("Retira Ultimo Livro : " + teste.testRetiraUltimoLivro());
//
//		System.out.println("\n" + "tNao Adiciona Por Padrao livros com Letra Inicial diferente de 'A' ou 'O' : " + teste.testNaoAdicionaPorPadraoLetraInicial());
		
		System.out.println("\n" + "Nao Adicionar Livro Alem do Limite : " + teste.testNaoAdicionarLivroAlemLimite());

	}

}
