package com.semantic.sigp.api.v1.controller;

import com.semantic.sigp.api.core.controller.AbstractRestController;
import com.semantic.sigp.api.core.service.IBaseService;
import com.semantic.sigp.api.v1.model.Categoria;
import com.semantic.sigp.api.v1.service.ICategoriaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("v1/categorias")
@CrossOrigin("*")
public class CategoriaRestController extends AbstractRestController<Categoria> {

	@Autowired
	private ICategoriaService service;

	@Override
	protected IBaseService<Categoria> getService() {
		return service;
	}

	@Override
	@GetMapping
	public ResponseEntity<List<Categoria>> listar() {
		return (ResponseEntity<List<Categoria>>) super.listar();
	}

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public Page<?> findPage(@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "10") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "descricao") String orderBy,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction) {

		return super.findPage(page, linesPerPage, orderBy, direction);
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> buscarPorId(@PathVariable long id) {
		return (ResponseEntity<Categoria>) super.buscarPorId(id);
	}

	@SuppressWarnings("unchecked")
	@PostMapping
	public ResponseEntity<Categoria> salvar(@RequestBody Categoria categoria) {
		return (ResponseEntity<Categoria>) super.salvar(categoria);
	}

	@SuppressWarnings("unchecked")
	@PutMapping("/{id}")
	public ResponseEntity<Categoria> editar(@PathVariable long id, @RequestBody Categoria categoria) {
		return (ResponseEntity<Categoria>) super.editar(id, categoria);
	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/{id}")
	public ResponseEntity<Categoria> excluir(@PathVariable long id) {
		return (ResponseEntity<Categoria>) super.excluir(id);
	}
}
