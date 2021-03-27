package com.br.gabryel.livraria;

public class PilhaTest {
	Pilha pilha;

	public boolean testRetiraUltimoLivro() {
		pilha = new Pilha();
		Livro livro1 = new Livro("A Fortaleza");
		Livro livro2 = new Livro("A Emboscada");
		Livro livro3 = new Livro("O Naufrago");

		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);

		String resultadoEsperado = livro3.getTitulo();

		return pilha.pop().getTitulo().equals(resultadoEsperado);
	}

	public boolean testNaoAdicionarLivroAlemLimite() {
		pilha = new Pilha();

		Livro livro1 = new Livro("A Fortaleza");
		Livro livro2 = new Livro("A Emboscada");
		Livro livro3 = new Livro("O Naufrago");
		Livro livro4 = new Livro("A Lua");
		Livro livro5 = new Livro("O Sol");
		Livro livro6 = new Livro("O Lago");

		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);
		pilha.push(livro6);

		String resultadoEsperado = livro5.getTitulo();

		return pilha.pop().getTitulo().equals(resultadoEsperado);
	}
	
	public boolean testNaoAdicionaPorPadraoLetraInicial() {
		pilha = new Pilha();
		Livro livro1 = new Livro("A Fortaleza");
		Livro livro2 = new Livro("Emboscada");

		pilha.push(livro1);
		pilha.push(livro2);

		String resultadoEsperado = livro1.getTitulo();

		return pilha.pop().getTitulo().equals(resultadoEsperado);
	}

}
