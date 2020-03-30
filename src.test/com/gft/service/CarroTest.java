package com.gft.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarroTest {
	
	private Carro carro;
	
	private CarroService carroSe;
	
	@Before
	public void setUp() {
		//carroSe.addCarro();
		carro = new Carro("Gol", "VW", 5, 5, 0, false);
		
	}
	
	@Test
	public void deveAdicionarCarro() {
		assertEquals("Gol", carro.getNome());
	}
	
	@Test
	public void deveLigarOCarro(){
		carro.setLigado(true);
		assertTrue(carro.isLigado());
		
	}
	
	@Test
	public void deveAbastecerCarro() {
		int qtdCombustivel = 20;
		carro.setCombustivel(qtdCombustivel + carro.getCombustivel());
		assertEquals(20, carro.getCombustivel());
	}
	

	
}
