package com.gft.service;

import java.util.ArrayList;
import java.util.List;

import com.gft.service.Carro;


public class CarroService {
	
	
	private List<Carro> carror = new ArrayList<>();

	public CarroService(List<Carro> carro) {
		this.carror = carro;
	}
	
	public void addCarro() {
		carror.add(new Carro("Gol", "VW", 5, 5, 0, false));
	}
	
	
	public void ligar() {
		((Carro) carror).setLigado(true);
	
	}


	
	

}
