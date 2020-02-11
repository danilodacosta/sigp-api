package com.semantic.sigp.api.v1.controller;

import com.semantic.sigp.api.core.controller.AbstractRestController;
import com.semantic.sigp.api.core.service.IBaseService;
import com.semantic.sigp.api.v1.model.Comunidade;
import com.semantic.sigp.api.v1.service.IComunidadeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("v1/comunidades")
@CrossOrigin("*")
public class ComunidadeRestController extends AbstractRestController<Comunidade> {

	@Autowired
	private IComunidadeService service;

	@Override
	protected IBaseService<Comunidade> getService() {
		return service;
	}

	@Override
	@GetMapping
	public ResponseEntity<List<Comunidade>> listar() {
		return (ResponseEntity<List<Comunidade>>) super.listar();
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
	public ResponseEntity<Comunidade> buscarPorId(@PathVariable long id) {
		return (ResponseEntity<Comunidade>) super.buscarPorId(id);
	}

	@SuppressWarnings("unchecked")
	@PostMapping
	public ResponseEntity<Comunidade> salvar(@RequestBody Comunidade Comunidade) {
		return (ResponseEntity<Comunidade>) super.salvar(Comunidade);
	}

	@SuppressWarnings("unchecked")
	@PutMapping("/{id}")
	public ResponseEntity<Comunidade> editar(@PathVariable long id, @RequestBody Comunidade Comunidade) {
		return (ResponseEntity<Comunidade>) super.editar(id, Comunidade);
	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/{id}")
	public ResponseEntity<Comunidade> excluir(@PathVariable long id) {
		return (ResponseEntity<Comunidade>) super.excluir(id);
	}

}
