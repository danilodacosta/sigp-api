package com.semantic.sigp.api.v1.controller;

import com.semantic.sigp.api.core.controller.AbstractRestController;
import com.semantic.sigp.api.core.service.IBaseService;
import com.semantic.sigp.api.v1.model.Atendimento;
import com.semantic.sigp.api.v1.service.IAtendimentoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("v1/atendimentos")
public class AtendimentoRestController extends AbstractRestController<Atendimento> {

	@Autowired
	private IAtendimentoService service;

	@Override
	protected IBaseService<Atendimento> getService() {
		return service;
	}

	@Override
	@GetMapping
	public ResponseEntity<List<Atendimento>> listar() {
		return (ResponseEntity<List<Atendimento>>) super.listar();
	}

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public Page<?> findPage(@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "10") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "protocolo") String orderBy,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction) {

		return super.findPage(page, linesPerPage, orderBy, direction);
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/{id}")
	public ResponseEntity<Atendimento> buscarPorId(@PathVariable long id) {
		return (ResponseEntity<Atendimento>) super.buscarPorId(id);
	}

	@SuppressWarnings("unchecked")
	@PostMapping
	public ResponseEntity<Atendimento> salvar(@RequestBody Atendimento atendimento) {
		return (ResponseEntity<Atendimento>) super.salvar(atendimento);
	}

	@SuppressWarnings("unchecked")
	@PutMapping("/{id}")
	public ResponseEntity<Atendimento> editar(@PathVariable long id, @RequestBody Atendimento atendimento) {
		return (ResponseEntity<Atendimento>) super.editar(id, atendimento);
	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/{id}")
	public ResponseEntity<Atendimento> excluir(@PathVariable long id) {
		return (ResponseEntity<Atendimento>) super.excluir(id);
	}
}
