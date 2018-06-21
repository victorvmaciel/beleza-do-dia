package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Agendamento;


@Service
public class AgendamentoService {
	
	public List<Agendamento> listAll(){
		return Arrays.asList(new Agendamento("000001","16/07/2018 às 15:30"),
				new Agendamento("00001","16/07/2018 às 17:30"));
		
	}

}
