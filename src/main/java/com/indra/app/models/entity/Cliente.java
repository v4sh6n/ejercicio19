package com.indra.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/*
 * Esto es una clase POJO con atributos y métodos getter & setter
 * mapeado a un tabla
 */

@Entity // mapea automaticamente atributos y campos de la clase
@Table(name = "clientes") // nomenclatura tablas en miniusculas y terminan el plural asi se diferencia de la clase
							

public class Cliente implements Serializable {
	/**
	 * Es recomendable para las clases Entity y JPA serializable: los objetos de
	 * esta clase pueden ser convertidos en bytes y luego restaurarlos a su forma
	 * original es recomendable para trabajar con BBDD
	 */

	/*
	 * Atributos
	 * 
	 * Del tipo Long con mayuscula(tipo de referencia de una clase que nos permite trabajar con conversiones de tipos)
	 * no del tipo primitivo, es la Primary Key asique se anota con @Id
	 * 
	 * 
	 * GeneratedValue indicamos la estrategia para MySQL y H2 es el más indicado
	 *
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// si quisieramos cambiar el nombre @Colum(name="Nombre_cliente")
	private String nombre;
	private String apellido;
	private String email;

	// fecha para agregar fecha de creación
	// importante que sea importada de utils y no de sql

	// en este caso cambiamos nombre por nomenclatura estandar de BBDD
	// temporal es para dar formato a la fecha en BBDD
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	private static final long serialVersionUID = 1L;

	// generamos getter & setter

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
