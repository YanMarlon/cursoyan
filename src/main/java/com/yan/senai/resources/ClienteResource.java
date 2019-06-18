package com.yan.senai.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yan.senai.domain.Cliente;
import com.yan.senai.services.ClienteService;

@RestController // Para serem Serializados e transformados em Json ou Xml
@RequestMapping(value = "/clientes") // caminho que será encontrado.
public class ClienteResource {

	// Buscando os métodos que estão em Cliente Service
	@Autowired // Faz a instanciação sem precisar do new
	private ClienteService service;

	// Nesse Resquesti pediremos o id do cliente
	// method requesitado é o get
	// Resposta da entidade será do Cliente em Domain
	// find e encontrar
	// @PathVariable - O valor vira da URL
	// obj - service (ClienteService metodo buscar)
	// Retorna no corpo do objeto todas as informações.
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cliente> find(@PathVariable Integer id) {
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

	// RequestMapping - buscar get
	// ResponseEntity - Classe Domain @Entity
	// List - lista onde <Cliente>
	// body - lista no corpo do compenente
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> findAll() {
		List<Cliente> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
