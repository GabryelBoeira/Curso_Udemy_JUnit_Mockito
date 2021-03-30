package com.br.gabryel.venda.model;

import com.br.gabryel.venda.service.CreditoService;

public class Venda {

	private Cliente cliente;
	private double valor;
	private CreditoService creditoService;
	
	public Venda(double valor, Cliente cliente, CreditoService creditoService) {
		this.cliente = cliente;
		this.valor = valor;
		this.creditoService = creditoService;
	}

	public boolean checkout() {

		double limite = creditoService.getLimiteCredito(cliente.getCpf());
		return valor < limite;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
}
