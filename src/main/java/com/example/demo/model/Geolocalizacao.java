package com.example.demo.model;

public class Geolocalizacao {

	public Geolocalizacao() {
	}

	public Geolocalizacao(String endereco,String numero, String bairro,String cidade,String estado, String cep,
		String latitude, String longitude) {

		this.endereco = endereco;
		this.numero=numero;
		this.latitude = latitude;
		this.longitude = longitude;
		this.bairro= bairro;
		this.cidade=cidade;
		this.estado=estado;
		this.cep = cep;
	}

	

	private String endereco;
	
	private String numero;
	
	private String bairro;
	
	private String cidade;
	
	private String estado;
	
	private String cep;
	
	private String latitude;

	private String longitude;
	
	
	
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}
	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	

}
