package br.com.cep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cep.model.Cep;
import br.com.cep.service.CepService;

@RestController
@RequestMapping("/cep")
public class CepController {

	@Autowired
	private CepService cepService;
	
	@CrossOrigin
	@GetMapping("{cep}")
	public Cep buscarCep(@PathVariable(value = "cep")  String cep) {
		return cepService.buscarCep(cep);
	}
	
}
