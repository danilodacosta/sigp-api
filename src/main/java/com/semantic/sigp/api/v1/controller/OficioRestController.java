package com.semantic.sigp.api.v1.controller;

import com.semantic.sigp.api.core.controller.AbstractRestController;
import com.semantic.sigp.api.core.service.IBaseService;
import com.semantic.sigp.api.v1.model.Oficio;
import com.semantic.sigp.api.v1.service.IOficioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("v1/oficios")
@CrossOrigin("*")
public class OficioRestController extends AbstractRestController<Oficio> {

	@Autowired
	private IOficioService service;

	@Override
	protected IBaseService<Oficio> getService() {
		return service;
	}

	@Override
	@GetMapping
	public ResponseEntity<List<Oficio>> listar() {
		return (ResponseEntity<List<Oficio>>) super.listar();
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public Page<Oficio> findPage(@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "10") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "situacao") String orderBy,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction) {

		return (Page<Oficio>) super.findPage(page, linesPerPage, orderBy, direction);
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/{id}")
	public ResponseEntity<Oficio> buscarPorId(@PathVariable long id) {
		return (ResponseEntity<Oficio>) super.buscarPorId(id);
	}

	@SuppressWarnings("unchecked")
	@PostMapping
	public ResponseEntity<Oficio> salvar(@RequestBody Oficio oficio) {
		return (ResponseEntity<Oficio>) super.salvar(oficio);
	}

	@SuppressWarnings("unchecked")
	@PutMapping("/{id}")
	public ResponseEntity<Oficio> editar(@PathVariable long id, @RequestBody Oficio oficio) {
		return (ResponseEntity<Oficio>) super.editar(id, oficio);
	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/{id}")
	public ResponseEntity<Oficio> excluir(@PathVariable long id) {
		return (ResponseEntity<Oficio>) super.excluir(id);
	}
}
