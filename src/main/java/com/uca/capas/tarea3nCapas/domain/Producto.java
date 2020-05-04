package com.uca.capas.tarea3nCapas.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {

	@Size(min = 12, max=12, message= "Codigo debe de ser de 12 digitos")
	@NotEmpty(message= "Se requiere llenar este campo")
	String codigoProducto;
	
	@Size(min=1,max=100, message="El nombre del producto debe tener entre 1 y 100 caracteres")
	@NotEmpty(message= "Se requiere llenar este campo")
	String nombre;
	
	@Size(min=1,max=100, message="La marca del producto debe de tener entre 1 y 100 caracteres")
	@NotEmpty(message= "Se requiere llenar este campo")
	String marca;
	
	@Size(min=1,max=500, message="La descripcion debe de tener entre 1 y 500 caracteres")
	String descripcion;
	
	@Digits(fraction = 0, integer = 10, message ="Las existencias no pueden ser decimales")
	@NotEmpty(message= "Se requiere llenar este campo")
	String existencias;
	
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$", message="El formato de la fecha debe ser 'dd/mm/yyyy'")
	String fIngreso;
	
	public Producto() {}

	public Producto(String codigoProducto, String nombre, String marca, String descripcion, String existencias,
			String fIngreso) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.existencias = existencias;
		this.fIngreso = fIngreso;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescrpcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getExistencias() {
		return existencias;
	}

	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}

	public String getfIngreso() {
		return fIngreso;
	}

	public void setfIngreso(String fIngreso) {
		this.fIngreso = fIngreso;
	}
	
	
}
