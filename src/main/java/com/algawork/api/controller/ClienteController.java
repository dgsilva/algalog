package com.algawork.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algawork.api.domain.modal.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente>findAll(){
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Diego");
		cliente1.setEmail("diegorj93@gmail.com");
		cliente1.setTelefone("9999-9999");
		return Arrays.asList(cliente1);
	}
}
