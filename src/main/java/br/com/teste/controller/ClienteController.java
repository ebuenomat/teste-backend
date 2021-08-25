package br.com.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.model.Cliente;
import br.com.teste.repository.ClienteRepository;
import br.com.teste.utils.MessageUtil;

@RestController
@RequestMapping(value = "/api/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public ResponseEntity<?> getClientes() {
		return ResponseEntity.ok().body(clienteRepository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<?> saveCliente(@RequestBody @Validated Cliente cliente, BindingResult result) {
		if (result.hasErrors()) 
			return ResponseEntity.badRequest().body(MessageUtil.getMessages(result.getAllErrors()));
		
		return ResponseEntity.ok().body(clienteRepository.save(cliente));
	}
	
	@PutMapping
	public ResponseEntity<?> updateCliente(@RequestBody @Validated Cliente cliente, BindingResult result) {
		if (result.hasErrors()) 
			return ResponseEntity.badRequest().body(MessageUtil.getMessages(result.getAllErrors()));
		
		return ResponseEntity.ok().body(clienteRepository.save(cliente));
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteProduto(@PathVariable(required = true) Integer id) {
		clienteRepository.deleteById(id);
		
		return ResponseEntity.ok().body(null);
	}
	
}
