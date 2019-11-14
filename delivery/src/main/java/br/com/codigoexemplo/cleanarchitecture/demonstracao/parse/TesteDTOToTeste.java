package br.com.codigoexemplo.cleanarchitecture.demonstracao.parse;

import org.springframework.stereotype.Component;

import br.com.codigoexemplo.cleanarchitecture.demonstracao.dto.TesteDTO;
import br.com.codigoexemplo.cleanarchitecture.demonstracao.entity.Teste;

@Component
public class TesteDTOToTeste {
	
	public Teste parse(TesteDTO testeDTO) {
		return new Teste();
	}

}
