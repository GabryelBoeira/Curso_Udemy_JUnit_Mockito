package com.br.gabryel.livraria;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PilhaTestFixture {

	private static Pilha pilha;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pilha = new Pilha();
		
		System.out.println("Executou o @BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		pilha = null;
		System.out.println("Executou o @AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		Livro livro1 = new Livro("A Terra");
		Livro livro2 = new Livro("A Roda");
		Livro livro3 = new Livro("O Globo");
		Livro livro4 = new Livro("A Lua");
		Livro livro5 = new Livro("O Sol");
		
		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);
		
		System.out.println("Excutou @Before");
	}

	@After
	public void tearDown() throws Exception {
		int tamanho = pilha.count();
		while (tamanho > 0) {
			pilha.pop();
			tamanho--;
		}
		
		System.out.println("Excutou @After");
	}

	@Test
	public void testNaoAdicionarLivroAlemLimite() {
		
		pilha.push(new Livro("A Volta ao mundo em 80 dias"));	
		Livro resultado = pilha.pop();
		
		System.out.println("Excutou testNaoAdicionarLivroAlemLimite()");
		assertEquals("O Sol", resultado.getTitulo());
	}
	
	@Test
	public void testNaoAdicionaPorPadraoLetraInicial() {
		pilha.pop();
		pilha.push(new Livro("Não Valido"));	
		Livro resultado = pilha.pop();
		
		assertEquals("A Lua", resultado.getTitulo());
		System.out.println("Excutou testNaoAdicionaPorPadraoLetraInicial()");
	}

}
