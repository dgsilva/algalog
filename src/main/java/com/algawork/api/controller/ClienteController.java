package com.algawork.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algawork.api.domain.modal.Cliente;
import com.algawork.api.repositories.ClienteRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	
	private ClienteRepository clienteRepository;
	
	@GetMapping()
	public List<Cliente>findAll(){
	List<Cliente> list =  clienteRepository.findAll();
	return list;
	}
	
	@GetMapping("/{clienteId}")
	public ResponseEntity<Cliente> buscar(@PathVariable Long clienteId) {
		Optional<Cliente>cliente = clienteRepository.findById(clienteId);
		 
		if(cliente.isPresent()) {
			return ResponseEntity.ok(cliente.get());
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/nome-por")
	public List<Cliente>findAll(String nome){
	List<Cliente> list =  clienteRepository.findByNome(nome);
	return list;
	}
}
