package com.br.gabryel.venda.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import com.br.gabryel.venda.model.Cliente;
import com.br.gabryel.venda.model.Venda;
import com.br.gabryel.venda.service.CreditoService;

class VendaTest {

	@Test
	void testCheckoutClienteComLimiteCredito() {

		Cliente cliente = new Cliente("456", "João");
		CreditoService creditoService = mock(CreditoService.class);
		when(creditoService.getLimiteCredito(cliente.getCpf())).thenReturn(2500d);
		Venda venda = new Venda(2000, cliente, creditoService);

		boolean resultado = venda.checkout();
		assertTrue(resultado);
	}

	@Test
	void testCheckoutClienteSemLimiteCredito() {

		Cliente cliente = new Cliente("456", "João");
		CreditoService creditoService = mock(CreditoService.class);
		Venda venda = new Venda(2000, cliente, creditoService);
		when(creditoService.getLimiteCredito(cliente.getCpf())).thenReturn(1000d);

		boolean resultado = venda.checkout();
		assertFalse(resultado);
	}

}
