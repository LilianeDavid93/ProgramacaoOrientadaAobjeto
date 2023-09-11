package br.com.poo.analisedecredito.entidades;

import java.util.Date;

public class Cartao {

	private int cartaoId;
	private String fechamentoCiclo;
	private String numeroCartao;
	private String cvv;
	private Date validade;
	private double limiteDeCredito;
	private int usuarioId;
	private int produtoId;
	private int solicitacaoId;
	private Usuario usuario;
	private Solicitacao solicitacao;
	private Produto produto;
	
	
	public Cartao(int cartaoId, String fechamentoCiclo, String numeroCartao, String cvv, Date validade,
			double limiteDeCredito, int usuarioId, int produtoId, int solicitacaoId, Usuario usuario, 
			Solicitacao solicitacao, Produto produto) {
		super();
		this.cartaoId = cartaoId;
		this.fechamentoCiclo = fechamentoCiclo;
		this.numeroCartao = numeroCartao;
		this.cvv = cvv;
		this.validade = validade;
		this.limiteDeCredito = limiteDeCredito;
		this.usuarioId = usuarioId;
		this.produtoId = produtoId;
		this.solicitacaoId = solicitacaoId;
		this.usuario = usuario;
		this.solicitacao = solicitacao;
		this.produto = produto;
	}

	public int getCartaoId() {
		return cartaoId;
	}

	public void setCartaoId(int cartaoId) {
		this.cartaoId = cartaoId;
	}

	public String getFechamentoCiclo() {
		return fechamentoCiclo;
	}

	public void setFechamentoCiclo(String fechamentoCiclo) {
		this.fechamentoCiclo = fechamentoCiclo;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public double getLimiteDeCredito() {
		return limiteDeCredito;
	}

	public void setLimiteDeCredito(double limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}

	public int getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public int getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(int produtoId) {
		this.produtoId = produtoId;
	}

	public int getSolicitacaoId() {
		return solicitacaoId;
	}

	public void setSolicitacaoId(int solicitacaoId) {
		this.solicitacaoId = solicitacaoId;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Solicitacao getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Cartao [cartaoId=" + cartaoId + ", fechamentoCiclo=" + fechamentoCiclo + ", numeroCartao="
				+ numeroCartao + ", cvv=" + cvv + ", validade=" + validade + ", limiteDeCredito=" + limiteDeCredito
				+ ", usuarioId=" + usuarioId + ", produtoId=" + produtoId + ", solicitacaoId=" + solicitacaoId + "]";
	}
	
	
	
}
