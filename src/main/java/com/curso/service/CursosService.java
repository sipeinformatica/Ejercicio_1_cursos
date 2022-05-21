package com.curso.service;

import java.util.List;

import com.curso.model.Curso;

public interface CursosService {
	List<Curso> cursos();
	Curso buscarCurso(String codCurso);
	void altaCurso(Curso curso);
	void actualizarCurso(Curso curso);
	List<Curso> eliminarCurso(String codCurso);
	List<Curso> cursosPorPrecio(Float min, Float max);
}
