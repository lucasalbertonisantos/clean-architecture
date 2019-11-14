package br.com.codigoexemplo.cleanarchitecture.demonstracao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.codigoexemplo.cleanarchitecture.demonstracao.adapter.TesteAdapter;
import br.com.codigoexemplo.cleanarchitecture.demonstracao.entity.Teste;

@Service
public class TesteService {
	
	@Autowired
	private TesteAdapter testeAdapter;
	
	public Teste salvar(Teste teste) {
		return testeAdapter.salvar(teste);
	}

}
