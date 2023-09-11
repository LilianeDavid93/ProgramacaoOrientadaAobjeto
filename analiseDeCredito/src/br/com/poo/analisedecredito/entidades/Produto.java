package br.com.poo.analisedecredito.entidades;

public class Produto {

	private int produtoId;
	private String nome;
	private double anuidade;
	private String operadora;
	private double limiteTotalCredito;
	
	public Produto(int produtoId, String nome, double anuidade, String operadora, double limiteTotalCredito) {
		super();
		this.produtoId = produtoId;
		this.nome = nome;
		this.anuidade = anuidade;
		this.operadora = operadora;
		this.limiteTotalCredito = limiteTotalCredito;
	}

	public int getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(int produtoId) {
		this.produtoId = produtoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAnuidade() {
		return anuidade;
	}

	public void setAnuidade(double anuidade) {
		this.anuidade = anuidade;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public double getLimiteTotalCredito() {
		return limiteTotalCredito;
	}

	public void setLimiteTotalCredito(double limiteTotalCredito) {
		this.limiteTotalCredito = limiteTotalCredito;
	}

	@Override
	public String toString() {
		return "Produto [produtoId=" + produtoId + ", nome=" + nome + ", anuidade=" + anuidade + ", operadora="
				+ operadora + ", limiteTotalCredito=" + limiteTotalCredito + "]";
	}
	
	
}
