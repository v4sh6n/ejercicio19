package com.indra.app.models.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.indra.app.models.entity.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

/*
 * "Data Access Object" DAO
 * Clase de persistencia que se encarga de acceder a los datos
 * 
 * La anotación Repository marca la clase como componente de persistencia
 * de acceso a datos
 */


@Repository
public class ClienteDaoImpl implements IClienteDao {
	/*
	 * El EntityManager se encarga de manejar las clases de entidades
	 * Realzia las operaciones como consultas etc...
	 */
	
	@PersistenceContext //inyecta el EntityManager
	private EntityManager em;
	
	@Transactional // se utiliza para indicar que un método (o clase) debe ejecutarse dentro de una transacción.
	@Override
	public List<Cliente> findAll() {
		
		//realizamos una consulta con createQuery from la clase Cliente
		return em.createQuery("from Cliente").getResultList();
	}

}
