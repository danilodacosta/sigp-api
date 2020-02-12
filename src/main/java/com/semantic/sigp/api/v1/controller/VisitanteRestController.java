package com.semantic.sigp.api.v1.controller;

import com.semantic.sigp.api.core.controller.AbstractRestController;
import com.semantic.sigp.api.core.service.IBaseService;
import com.semantic.sigp.api.v1.model.Visitante;
import com.semantic.sigp.api.v1.service.IVisitanteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("v1/visitantes")
@CrossOrigin("*")
public class VisitanteRestController extends AbstractRestController<Visitante> {

	@Autowired
	private IVisitanteService service;

	@Override
	protected IBaseService<Visitante> getService() {
		return service;
	}

	@Override
	@GetMapping
	public ResponseEntity<List<Visitante>> listar() {
		return (ResponseEntity<List<Visitante>>) super.listar();
	}

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public Page<?> findPage(@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "10") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "nome") String orderBy,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction) {

		return super.findPage(page, linesPerPage, orderBy, direction);
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/{id}")
	public ResponseEntity<Visitante> buscarPorId(@PathVariable long id) {
		return (ResponseEntity<Visitante>) super.buscarPorId(id);
	}

	@SuppressWarnings("unchecked")
	@PostMapping
	public ResponseEntity<Visitante> salvar(@RequestBody Visitante Visitante) {
		return (ResponseEntity<Visitante>) super.salvar(Visitante);
	}

	@SuppressWarnings("unchecked")
	@PutMapping("/{id}")
	public ResponseEntity<Visitante> editar(@PathVariable long id, @RequestBody Visitante Visitante) {
		return (ResponseEntity<Visitante>) super.editar(id, Visitante);
	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/{id}")
	public ResponseEntity<Visitante> excluir(@PathVariable long id) {
		return (ResponseEntity<Visitante>) super.excluir(id);
	}

}
