package com.yan.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yan.senai.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	//Jpa fará todo o serviço de insert, delete, update, etc....
	//Veja que busca de Cliente e o Integer e que tipo do nosso id e Integer
	//Veja que é uma interface que extende os recursos do Jpa.

}


