package br.com.poo.analisedecredito.entidades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private int usuarioId;
	private String nomeCompleto;
	private String rendaMensal;
	private String cpf;
	private String telefone;
	private String endereco;
	private List<Cartao> cartoes;
	private List<Solicitacao> solicitacoes;
	
	public Usuario(int usuarioId, String nomeCompleto, String rendaMensal, String cpf, String telefone,
			String endereco) {
		super();
		this.usuarioId = usuarioId;
		this.nomeCompleto = nomeCompleto;
		this.rendaMensal = rendaMensal;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.solicitacoes = new ArrayList<>();
		this.cartoes = new ArrayList<>();
	}
	public Usuario() {
		this.solicitacoes = new ArrayList<>();
		this.cartoes = new ArrayList<>();
	}
	
	public int getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(String rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Cartao> getCartoes() {
		return cartoes;
	}

	public void setCartoes(List<Cartao> cartoes) {
		this.cartoes = cartoes;
	}

	public List<Solicitacao> getSolicitacoes() {
		return solicitacoes;
	}

	public void setSolicitacoes(List<Solicitacao> solicitacoes) {
		this.solicitacoes = solicitacoes;
	}	
	
	@Override
	public String toString() {
		return "Usuario [usuarioId=" + usuarioId + ", nomeCompleto=" + nomeCompleto + ", rendaMensal=" + rendaMensal
				+ ", cpf=" + cpf + ", telefone=" + telefone + ", endereco=" + endereco + ", cartoes=" + cartoes + "]";
	}	
	
}
