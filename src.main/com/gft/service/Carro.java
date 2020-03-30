package com.gft.service;

public class Carro {
	
	private String nome;
	
	private String marca;
	
	private int ano;
	
	private int passageiro;
	
	private int combustivel;

	private boolean ligado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(int passageiro) {
		this.passageiro = passageiro;
	}
	public int getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public Carro(String nome, String marca, int ano, int passageiro, int combustivel, boolean b) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.ano = ano;
		this.passageiro = passageiro;
		this.combustivel = combustivel;
		this.ligado = b;
	}
	
	public Carro() {
		
	}
	
	public void addCarro() {
		Carro carro = new Carro("Gol", "VW", 5, 5, 0, false);
	}
	
	
}
