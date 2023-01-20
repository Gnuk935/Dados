package com.barros.model;

public class PessoaModel {
	//Nome,  cpf, cidade, bairro, estado
	
	private String nome;
	private Double cpf;
	private String cidade;
	private String bairro;
	private String estado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getCpf() {
		return cpf;
	}
	public void setCpf(double d) {
		this.cpf = d;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
