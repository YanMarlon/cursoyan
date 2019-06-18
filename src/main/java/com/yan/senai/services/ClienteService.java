package com.yan.senai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yan.senai.domain.Cliente;
import com.yan.senai.repositories.ClienteRepository;
import com.yan.senai.repositories.EnderecoRepository;
import com.yan.senai.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	@Autowired 
	private EnderecoRepository enderecoRepository; 
	
	public Cliente insert(Cliente obj) {
		obj.setIdCliente(null);//Set Cliente do Domain
		obj = repo.save(obj);/*Save do Repository de repo*/
		//usando o Repositories de save (Post)
		enderecoRepository.saveAll(obj.getEnderecos());
		//Salvar o Endereco digitado.
		return obj;
	}
	public Cliente buscar(Integer idCliente) {
		Optional<Cliente> obj = repo.findById(idCliente);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Número de id não encontrado. Id: " + idCliente + ", tipo: " + Cliente.class.getName()));
	}

//Buscar todos os clientes.
	// Retornar uma lista - list
	// findAll - encontrar todos
	// repo - private ClienteRepository repo;
	public List<Cliente> findAll() {
		return repo.findAll();
	}
}