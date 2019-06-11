package com.yan.senai;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yan.senai.domain.Cidade;
import com.yan.senai.domain.Cliente;
import com.yan.senai.domain.Endereco;
import com.yan.senai.domain.Estado;
import com.yan.senai.domain.enuns.TipoCliente;
import com.yan.senai.repositories.CidadeRepository;
import com.yan.senai.repositories.ClienteRepository;
import com.yan.senai.repositories.EnderecoRepository;
import com.yan.senai.repositories.EstadoRepository;

@SpringBootApplication
public class CursoSenaiApplication implements CommandLineRunner{
	
	//Uma dependencia para instanciar todo o objeto.
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursoSenaiApplication.class, args);
}
	
	@Override
	public void run(String... args) throws Exception {
		//Instancio estado e preencho
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		//Foi chamado acima e aqui salva.
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		
		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		cidadeRepository.saveAll(Arrays.asList(c1,c2));
		
		Cliente cli1 = new Cliente(null, "Yan Marlon", "10735728623", "yanmarloncarneiro@hotmail.com",
				TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("34900000000", "98765432112"));
		clienteRepository.saveAll(Arrays.asList(cli1));
		
		Cliente cli2 = new Cliente(null, "Arthur Giovanni", "12345678910", "arthurgiovanni@hotmail.com",
				TipoCliente.PESSOAFISICA);
		cli2.getTelefones().addAll(Arrays.asList("56800000000", "84765432112"));
		clienteRepository.saveAll(Arrays.asList(cli2));
		
		Cliente cli3 = new Cliente(null, "Gustavo Lucindo", "14567839012", "GustavoLucindo@hotmail.com",
				TipoCliente.PESSOAFISICA);
		cli3.getTelefones().addAll(Arrays.asList("67500000000", "54765432112"));
		clienteRepository.saveAll(Arrays.asList(cli3));
		
		Cliente cli4 = new Cliente(null, "Luis Hatano", "15674389201", "LuisHatano@hotmail.com",
				TipoCliente.PESSOAFISICA);
		cli4.getTelefones().addAll(Arrays.asList("13600000000", "13765432112"));
		clienteRepository.saveAll(Arrays.asList(cli4));
		
		Cliente cli5 = new Cliente(null, "Matheus Souza", "30745672918", "Matheusouza@hotmail.com",
				TipoCliente.PESSOAFISICA);
		cli5.getTelefones().addAll(Arrays.asList("98600000000", "48965432112"));
		clienteRepository.saveAll(Arrays.asList(cli5));
		
		Cliente cli6 = new Cliente(null, "Nathanael Camillo", "12376598012", "Nathanaelcamillo@hotmail.com",
				TipoCliente.PESSOAFISICA);
		cli6.getTelefones().addAll(Arrays.asList("58300000000", "68965432112"));
		clienteRepository.saveAll(Arrays.asList(cli6));
		
		Cliente cli7 = new Cliente(null, "Leyber Araujo", "12376598012", "Leyberaraujo@hotmail.com",
				TipoCliente.PESSOAFISICA);
		cli7.getTelefones().addAll(Arrays.asList("94100000000", "78965432113"));
		clienteRepository.saveAll(Arrays.asList(cli7));
		
		Cliente cli8 = new Cliente(null, "Vinicius Santos", "98076598012", "Viniciusantos@hotmail.com",
				TipoCliente.PESSOAFISICA);
		cli8.getTelefones().addAll(Arrays.asList("27100000000", "78905432113"));
		clienteRepository.saveAll(Arrays.asList(cli8));
		
		Cliente cli9 = new Cliente(null, "Caio Ribeiro", "18076598012", "Caioribeiro@hotmail.com",
				TipoCliente.PESSOAFISICA);
		cli9.getTelefones().addAll(Arrays.asList("30100000000", "58905432113"));
		clienteRepository.saveAll(Arrays.asList(cli9));
		
		Cliente cli10 = new Cliente(null, "Gabriel Vinicius", "64076598012", "Gabrielvinicius@hotmail.com",
				TipoCliente.PESSOAFISICA);
		cli10.getTelefones().addAll(Arrays.asList("40500000000", "58902432113"));
		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5, cli6, cli7, cli8, cli9, cli10));
		
	
	Endereco e1 = new Endereco(null, "Ruas dos Emboabas","1",null, "Jardim","38447587",cli1,c1);
	Endereco e2 = new Endereco(null, "Ruas dos Carajas","2",null, "Jardim","38147587",cli2,c1);
	Endereco e3 = new Endereco(null, "Ruas dos Emboabas","3",null, "Jardim","38447587",cli3,c1);
	Endereco e4 = new Endereco(null, "Ruas dos Emboabas","4",null, "Jardim","38447587",cli4,c1);
	Endereco e5 = new Endereco(null, "Ruas dos Carajas","2",null, "Jardim","38147587",cli5,c1);
	Endereco e6 = new Endereco(null, "Ruas dos Carajas","3",null, "Jardim","38147587",cli6,c1);
	Endereco e7 = new Endereco(null, "Ruas dos Emboabas","2",null, "Jardim","38447587",cli7,c1);
	Endereco e8 = new Endereco(null, "Ruas dos Carajas","4",null, "Jardim","38147587",cli8,c1);
	Endereco e9 = new Endereco(null, "Ruas dos Emboabas","5",null, "Jardim","38447587",cli9,c1);
	Endereco e10 = new Endereco(null, "Ruas dos Carajas","5",null, "Jardim","38147587",cli10,c1);
	

	enderecoRepository.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10));
	}
}
