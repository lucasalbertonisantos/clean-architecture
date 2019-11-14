package br.com.codigoexemplo.cleanarchitecture.demonstracao.persistence;

import org.springframework.stereotype.Repository;

import br.com.codigoexemplo.cleanarchitecture.demonstracao.adapter.TesteAdapter;
import br.com.codigoexemplo.cleanarchitecture.demonstracao.entity.Teste;

@Repository
public class TestePersistence implements TesteAdapter{

	@Override
	public Teste salvar(Teste teste) {
		// TODO Auto-generated method stub
		return null;
	}

}
