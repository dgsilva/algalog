package com.algawork.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algawork.api.domain.modal.Cliente;
import com.algawork.api.repositories.ClienteRepository;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping()
	public List<Cliente>findAll(){
	List<Cliente> list =  clienteRepository.findAll();
	return list;
	}
	
}
