package br.com.codigoexemplo.cleanarchitecture.demonstracao.parse;

import org.springframework.stereotype.Component;

import br.com.codigoexemplo.cleanarchitecture.demonstracao.dto.TesteDTO;
import br.com.codigoexemplo.cleanarchitecture.demonstracao.entity.Teste;

@Component
public class TesteToTesteDTO {
	
	public TesteDTO parse(Teste teste) {
		return new TesteDTO();
	}

}
