package com.semantic.sigp.api.v1.controller;

import com.semantic.sigp.api.core.controller.AbstractRestController;
import com.semantic.sigp.api.core.service.IBaseService;
import com.semantic.sigp.api.v1.model.Memorando;
import com.semantic.sigp.api.v1.service.IMemorandoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("v1/memorandos")
public class MemorandoRestController extends AbstractRestController<Memorando> {

	@Autowired
	private IMemorandoService service;

	@Override
	protected IBaseService<Memorando> getService() {
		return service;
	}

	@Override
	@GetMapping
	public ResponseEntity<List<Memorando>> listar() {
		return (ResponseEntity<List<Memorando>>) super.listar();
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public Page<Memorando> findPage(@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "10") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "situacao") String orderBy,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction) {

		return (Page<Memorando>) super.findPage(page, linesPerPage, orderBy, direction);
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/{id}")
	public ResponseEntity<Memorando> buscarPorId(@PathVariable long id) {
		return (ResponseEntity<Memorando>) super.buscarPorId(id);
	}

	@SuppressWarnings("unchecked")
	@PostMapping
	public ResponseEntity<Memorando> salvar(@RequestBody Memorando memorando) {
		return (ResponseEntity<Memorando>) super.salvar(memorando);
	}

	@SuppressWarnings("unchecked")
	@PutMapping("/{id}")
	public ResponseEntity<Memorando> editar(@PathVariable long id, @RequestBody Memorando memorando) {
		return (ResponseEntity<Memorando>) super.editar(id, memorando);
	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/{id}")
	public ResponseEntity<Memorando> excluir(@PathVariable long id) {
		return (ResponseEntity<Memorando>) super.excluir(id);
	}
}
