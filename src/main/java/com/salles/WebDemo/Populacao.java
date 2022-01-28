package com.salles.WebDemo;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.salles.WebDemo.rh.dominio.Pessoa;
import com.salles.WebDemo.rh.dominio.PessoaRepository;

@Component
@Transactional
public class Populacao implements CommandLineRunner{
	
	@Autowired
	private PessoaRepository PessoaRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Pessoa p1 = new Pessoa("João");
		p1.setDataNasc(LocalDate.of(1990, 9, 11));
		p1.setEmail("joao@hmail.com");
		
		Pessoa p2 = new Pessoa("Maria");
		p2.setDataNasc(LocalDate.of(2000, 2, 1));
		p2.setEmail("maria@hmail.com");
		
		PessoaRepo.save(p1);
		PessoaRepo.save(p2);
	}
	
	
}
