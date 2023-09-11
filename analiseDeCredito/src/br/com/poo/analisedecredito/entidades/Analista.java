package br.com.poo.analisedecredito.entidades;

import java.util.ArrayList;
import java.util.List;

public class Analista {

	private int analistaId;
	private String nome;
	private List<Solicitacao> analises;
	
	public Analista(int analistaId, String nome) {
		super();
		this.analistaId = analistaId;
		this.nome = nome;
		this.analises = new ArrayList<>();
	}

	public int getAnalistaId() {
		return analistaId;
	}

	public void setAnalistaId(int analistaId) {
		this.analistaId = analistaId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Solicitacao> getAnalises() {
		return analises;
	}

	public void setAnalises(List<Solicitacao> analises) {
		this.analises = analises;
	}	

	@Override
	public String toString() {
		return "Analista [analistaId=" + analistaId + ", nome=" + nome + "]";
	}
	
	
}
