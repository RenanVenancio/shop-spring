package com.techzone.shop.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/client")
public class ClientService {

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public Map<String, Object> test() {
		Map<String, Object> mapTest = new HashMap<>();
		mapTest.put("name", "Renan Venancio");
		mapTest.put("profissao", "Desenvolvedor");
		
		return mapTest;
	}
	
}
