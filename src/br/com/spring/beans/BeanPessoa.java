package br.com.spring.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class BeanPessoa {

	private String nome;
	private String fone;
	private BeanEndereco endereco;

	public BeanPessoa() {
		System.out.println("Executou o método construtor Pessoa.");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public BeanEndereco getEndereco() {
		return endereco;
	}

	public void setEndereco(BeanEndereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "BeanPessoa [nome=" + nome + ", fone=" + fone + ", endereco=" + endereco + "]";
	}

}
