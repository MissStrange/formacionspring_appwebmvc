package com.formacionspringboot.appwebmvc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proyectos")
public class Proyecto implements Serializable{

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length=50)
	private String nombre;
	
	@Column(name="fecha_inicio")
	private Date fechaInicio;
	
	@Column(name="fecha_fin")
	private Date fechaFin;
	
	@Column
	private String activo;

	private static final long serialVersionUID = 1L;
	
	
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

	public Date getFechaInicio() {
		
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		
		this.fechaFin = fechaFin;
	}

	public String getActivo() {
		
		return activo;
	}

	public void setActivo(String activo) {
		
		this.activo = activo;
	}	
	
}
