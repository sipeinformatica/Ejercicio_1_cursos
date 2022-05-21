package com.curso.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso {
	@Id
	private String codCurso;
	private String nombre;
	private Float duracion;
	private Float precio;
	
	public Curso(String codCurso, String nombre, Float duracion, Float precio) {
		super();
		this.codCurso= codCurso;
		this.nombre = nombre;
		this.duracion = duracion;
		this.precio = precio;
	}
	public Curso() {
		super();
	}
	public String getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Float getDuracion() {
		return duracion;
	}
	public void setDuracion(Float duracion) {
		this.duracion = duracion;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	
	
}
