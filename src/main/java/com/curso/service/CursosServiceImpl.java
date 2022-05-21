package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CursosDao;
import com.curso.model.Curso;
@Service
public class CursosServiceImpl implements CursosService {
	@Autowired
	CursosDao dao;
	
	@Override
	public List<Curso> cursos() {
		return dao.findAll();
	}

	@Override
	public Curso buscarCurso(String codCurso) {
		return dao.findById(codCurso).orElse(null);
	}

	@Override
	public void altaCurso(Curso curso) {
		dao.save(curso);

	}

	@Override
	public void actualizarCurso(Curso curso) {
		dao.save(curso);

	}

	@Override
	public List<Curso> eliminarCurso(String cod) {
		dao.deleteById(cod);
		return dao.findAll();
	}
	
	public List<Curso> cursosPorPrecio(Float min, Float max){
		
		return dao.getCursosPorPrecio(min, max);
	}

}
