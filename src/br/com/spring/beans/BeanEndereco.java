package br.com.spring.beans;

public class BeanEndereco {
	private String descricao;
	private int numero;
	private String bairro;

	public BeanEndereco() {
		System.out.println("Metodo Construto Endereco.");
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Override
	public String toString() {
		return "BeanEndereco [\ndescricao=" + descricao + ", \nnumero=" + numero + ", \nbairro=" + bairro + "]";
	}

}
