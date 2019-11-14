package br.com.codigoexemplo.cleanarchitecture.demonstracao.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.codigoexemplo.cleanarchitecture.demonstracao.dto.TesteDTO;
import br.com.codigoexemplo.cleanarchitecture.demonstracao.entity.Teste;
import br.com.codigoexemplo.cleanarchitecture.demonstracao.parse.TesteDTOToTeste;
import br.com.codigoexemplo.cleanarchitecture.demonstracao.parse.TesteToTesteDTO;
import br.com.codigoexemplo.cleanarchitecture.demonstracao.service.TesteService;

@RestController
@RequestMapping("teste")
public class TesteAPI {
	
	@Autowired
	private TesteService testeService;
	
	@Autowired
	private TesteDTOToTeste testeDTOToTeste;
	
	@Autowired
	private TesteToTesteDTO testeToTesteDTO;
	
	@PostMapping("/salvar")
	public TesteDTO salvar(TesteDTO testeDTO) {
		Teste teste = testeDTOToTeste.parse(testeDTO);
		return testeToTesteDTO.parse(testeService.salvar(teste));
	}

}
