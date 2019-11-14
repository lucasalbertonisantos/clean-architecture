package br.com.codigoexemplo.cleanarchitecture.demonstracao.adapter;

import org.springframework.stereotype.Repository;

import br.com.codigoexemplo.cleanarchitecture.demonstracao.entity.Teste;

@Repository
public interface TesteAdapter {
	
	public Teste salvar(Teste teste);

}
