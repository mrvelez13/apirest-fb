package com.freshbusiness.apirest.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freshbusiness.apirest.app.models.entity.Integrante;
import com.freshbusiness.apirest.app.models.services.IIntegranteService;

@RestController
@RequestMapping("/api")
public class IntegranteRestController {
	
	@Autowired
	private IIntegranteService integranteService;
	
	@GetMapping("/integrantes")
	public List<Integrante> listar(){
		return integranteService.findAll();
	}

}
