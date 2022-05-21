package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Curso;
import com.curso.service.CursosService;

@CrossOrigin("*")
@RestController
public class CursosController {

	@Autowired
	CursosService service;
	@GetMapping(value="curso/{cod}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Curso buscarCurso(@PathVariable("cod") String cod) {
		return service.buscarCurso(cod);
	}
	@GetMapping(value="cursos",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> cursos() {
		return service.cursos();
	}
	@PostMapping(value="curso",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void agregar(@RequestBody Curso curso) {
		service.altaCurso(curso);
	}
	@PutMapping(value="curso",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void actualizar(@RequestBody Curso curso) {
		service.actualizarCurso(curso);
	}
	@DeleteMapping(value="curso/{cod}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> eliminar(@PathVariable("cod") String cod){
		return service.eliminarCurso(cod);
	}
	
	@PutMapping(value="duracion/{cod}/{dur}")
	public void actualizarDuracion(@PathVariable("cod") String cod,  @PathVariable("dur") Float duracion) {
		Curso c = service.buscarCurso(cod);
		c.setDuracion(duracion);
		service.actualizarCurso(c);
	}
	
	@GetMapping(value="precio/{min}/{max}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> getCursosPorprecio(@PathVariable("min") Float min, @PathVariable("max") Float max){
		return service.cursosPorPrecio(min, max);
	}
}
