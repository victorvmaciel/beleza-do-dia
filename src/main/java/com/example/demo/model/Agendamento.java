package com.example.demo.model;



public class Agendamento {
	
	public Agendamento (String estabelecimentoId, String data) {
		
		this.estabelecimentoId=estabelecimentoId;
		this.data=data;
		
	}
	
	private String data;
	// yyyy/MM/dd hh:mm:ss
	private String estabelecimentoId;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getEstabelecimentoId() {
		return estabelecimentoId;
	}
	public void setEstabelecimentoId(String estabelecimentoId) {
		this.estabelecimentoId = estabelecimentoId;
	}
	
	
	
}
