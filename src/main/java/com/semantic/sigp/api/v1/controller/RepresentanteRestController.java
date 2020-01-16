package com.semantic.sigp.api.v1.controller;

import com.semantic.sigp.api.core.controller.AbstractRestController;
import com.semantic.sigp.api.core.service.IBaseService;
import com.semantic.sigp.api.v1.model.Representante;
import com.semantic.sigp.api.v1.service.IRepresentanteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("v1/representantes")
public class RepresentanteRestController extends AbstractRestController<Representante> {

	@Autowired
	private IRepresentanteService service;

	@Override
	protected IBaseService<Representante> getService() {
		return service;
	}

	@Override
	@GetMapping
	public ResponseEntity<List<Representante>> listar() {
		return (ResponseEntity<List<Representante>>) super.listar();
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
	public ResponseEntity<Representante> buscarPorId(@PathVariable long id) {
		return (ResponseEntity<Representante>) super.buscarPorId(id);
	}

	@SuppressWarnings("unchecked")
	@PostMapping
	public ResponseEntity<Representante> salvar(@RequestBody Representante representante) {
		return (ResponseEntity<Representante>) super.salvar(representante);
	}

	@SuppressWarnings("unchecked")
	@PutMapping("/{id}")
	public ResponseEntity<Representante> editar(@PathVariable long id, @RequestBody Representante representante) {
		return (ResponseEntity<Representante>) super.editar(id, representante);
	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/{id}")
	public ResponseEntity<Representante> excluir(@PathVariable long id) {
		return (ResponseEntity<Representante>) super.excluir(id);
	}

}
