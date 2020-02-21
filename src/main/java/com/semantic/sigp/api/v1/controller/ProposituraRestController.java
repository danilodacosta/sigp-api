package com.semantic.sigp.api.v1.controller;

import com.semantic.sigp.api.core.controller.AbstractRestController;
import com.semantic.sigp.api.core.service.IBaseService;
import com.semantic.sigp.api.v1.model.Oficio;
import com.semantic.sigp.api.v1.model.Propositura;
import com.semantic.sigp.api.v1.service.IProposituraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("v1/proposituras")
@CrossOrigin("*")
public class ProposituraRestController extends AbstractRestController<Propositura> {

	@Autowired
	private IProposituraService service;

	@Override
	protected IBaseService<Propositura> getService() {
		return service;
	}

	@Override
	@GetMapping
	public ResponseEntity<List<Propositura>> listar() {
		return (ResponseEntity<List<Propositura>>) super.listar();
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
	public ResponseEntity<Propositura> buscarPorId(@PathVariable long id) {
		return (ResponseEntity<Propositura>) super.buscarPorId(id);
	}

	@SuppressWarnings("unchecked")
	@PostMapping
	public ResponseEntity<Propositura> salvar(@RequestBody Propositura propositura) {
		return (ResponseEntity<Propositura>) super.salvar(propositura);
	}

	@SuppressWarnings("unchecked")
	@PutMapping("/{id}")
	public ResponseEntity<Propositura> editar(@PathVariable long id, @RequestBody Propositura propositura) {
		return (ResponseEntity<Propositura>) super.editar(id, propositura);
	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/{id}")
	public ResponseEntity<Propositura> excluir(@PathVariable long id) {
		return (ResponseEntity<Propositura>) super.excluir(id);
	}
}
