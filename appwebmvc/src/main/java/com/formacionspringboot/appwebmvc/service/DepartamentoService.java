package com.formacionspringboot.appwebmvc.service;

import java.util.List;

import com.formacionspringboot.appwebmvc.entity.Departamento;

public interface DepartamentoService {

public List<Departamento> listarTodosDepartamentos();
	
	public Departamento guardarDepartamento(Departamento departamento);
	
	public Departamento obtenerDepartamentoPorId(Long id);
	
	public void eliminarDepartamento(Long id);
}
