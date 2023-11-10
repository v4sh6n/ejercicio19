package com.indra.app.models.dao;

import java.util.List;

import com.indra.app.models.entity.Cliente;

public interface IClienteDao {
	
	/*
	 * Contiene el protocolo de comportamiento
	 * Interfaz que contiene los métodos que tiene que implementar
	 * la clase DAO
	 */
	
	public List<Cliente> findAll();

}
