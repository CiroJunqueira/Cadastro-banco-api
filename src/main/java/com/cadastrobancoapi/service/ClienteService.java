package com.cadastrobancoapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastrobancoapi.exceptionhandler.ErroException;
import com.cadastrobancoapi.model.Cliente;
import com.cadastrobancoapi.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente inserir(Cliente cliente) {
		
		this.procurarClientePorEmailCpf(cliente.getEmail(), cliente.getCpf());
		return clienteRepository.save(cliente);
		
	}

	public void procurarClientePorEmailCpf(String email, String cpf) {
		 {
			Cliente cliente = clienteRepository.findByCpf(cpf);
			if (cliente != null) {
				throw new ErroException ("Cpf já existente.");
			}
		}
		 {
			Cliente cliente = clienteRepository.findByEmail(email);
			if (cliente != null) {
				throw new ErroException ("E-mail já existente.");
			}
		}
	}
}

	
