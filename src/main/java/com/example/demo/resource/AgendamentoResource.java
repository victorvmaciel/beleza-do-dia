package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Agendamento;
import com.example.demo.service.AgendamentoService;



@RestController
@RequestMapping("/agendamento")
public class AgendamentoResource {
	
	@Autowired AgendamentoService agendamentoService;
	
	@GetMapping
	public List<Agendamento> listAll() {
		return agendamentoService.listAll();
	}
}
