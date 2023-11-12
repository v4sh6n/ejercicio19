package com.indra.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.indra.app.models.dao.IClienteDao;

@Controller //marcamos y configuramos la clase como controlador

public class ClienteController {
	
	//metodo para listar los clientes
	//importamos clase model para pasar datos a la vista
	
	//importamos interfaz DAO
	//para que este en el contexto usamos Autowired
	
	@Autowired
	private IClienteDao clienteDao;
	
	//para peticiones GET a vista listar
	@GetMapping("listar")
	public String listar(Model model) {
		model.addAttribute("titulo","Listado de Clientes");
		//pasamos el listado de clientes a la vista
		model.addAttribute("clientes",clienteDao.findAll());
		//retornamos nombre de la vista
		return "listar";
	}

}
