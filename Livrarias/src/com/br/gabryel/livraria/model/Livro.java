package com.br.gabryel.livraria.model;

public class Livro {

	private String titulo;
	
	public Livro() {
	}
	
	public Livro(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
