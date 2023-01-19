package com.barros.model;

public class PessoaModel {
	//Nome,  cpf, cidade, bairro, estado
	
	private String nome;
	private Float cpf;
	private String cidade;
	private String bairro;
	private String estado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getCpf() {
		return cpf;
	}
	public void setCpf(Float cpf) {
		this.cpf = cpf;
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
