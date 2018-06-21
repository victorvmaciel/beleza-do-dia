package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Geolocalizacao;
import com.example.demo.service.GeolocalizacaoService;

@RestController
@RequestMapping("/geolocalizacao")
public class GeolocalizacaoResource {

	@Autowired GeolocalizacaoService geolocalizacaoService;
	
	@GetMapping
	public List<Geolocalizacao> listAll() {
		
		return geolocalizacaoService.listAll();
	}

}
