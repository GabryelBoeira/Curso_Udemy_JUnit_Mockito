package com.br.gabryel.livraria;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Ignore;
import org.junit.Test;

import com.br.gabryel.livraria.model.Livro;
import com.br.gabryel.livraria.model.Pilha;
import com.br.gabryel.livraria.repository.PilhaRepositoryImpl;

public class PilhaTest {

	PilhaRepositoryImpl pilhaRepositoryMock = mock(PilhaRepositoryImpl.class);
	
	@Test
	public void testRetiraUltimoLivro() {
		Pilha pilha = new Pilha(pilhaRepositoryMock);
		Livro livro1 = new Livro("A Fortaleza");
		Livro livro2 = new Livro("A Emboscada");
		Livro livro3 = new Livro("O Naufrago");

		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);

		String resultadoEsperado = livro3.getTitulo();

		assertEquals(pilha.pop().getTitulo(), resultadoEsperado);
	}

	@Ignore
	public boolean testNaoAdicionarLivroAlemLimite() {
		Pilha pilha = new Pilha(pilhaRepositoryMock);

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
	
	@Test
	public void testNaoAdicionaPorPadraoLetraInicial() {
		Pilha pilha = new Pilha(pilhaRepositoryMock);
		Livro livro1 = new Livro("A Fortaleza");
		Livro livro2 = new Livro("Emboscada");

		pilha.push(livro1);
		pilha.push(livro2);

		String resultadoEsperado = livro1.getTitulo();

		assertEquals(pilha.pop().getTitulo(), resultadoEsperado);
	}

}
