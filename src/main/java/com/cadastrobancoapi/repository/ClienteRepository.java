package com.cadastrobancoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastrobancoapi.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	Cliente findByEmail(String email);
	
	Cliente findByCpf(String cpf);
	
}
