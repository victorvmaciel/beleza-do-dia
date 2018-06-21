package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Geolocalizacao;

@Service
public class GeolocalizacaoService {
	
	public List<Geolocalizacao> listAll() {
		return Arrays.asList(new Geolocalizacao("Rua Barra Verde", "331", "Genibaú", "Fortaleza", "CE", "6053634-510", "-3.758582", "-38.606784"), 
				
				
				new Geolocalizacao("Av Rogaciano Leite", "320", "Salinas", "Fortaleza", "CE", "60810-786", "-3.7607356", "-38.4931434"));
	}

}
