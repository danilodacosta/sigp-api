package com.semantic.sigp.api.v1.controller;

import com.semantic.sigp.api.core.controller.AbstractRestController;
import com.semantic.sigp.api.core.service.IBaseService;
import com.semantic.sigp.api.v1.model.Empresa;
import com.semantic.sigp.api.v1.service.IEmpresaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("v1/empresas")
public class EmpresaRestController extends AbstractRestController<Empresa> {

	@Autowired
	private IEmpresaService service;

	@Override
	protected IBaseService<Empresa> getService() {
		return service;
	}

	@Override
	@GetMapping
	public ResponseEntity<List<Empresa>> listar() {
		return (ResponseEntity<List<Empresa>>) super.listar();
	}
	
	@RequestMapping(value="/page", method=RequestMethod.GET)
	public Page<?> findPage(
			@RequestParam(value="page", defaultValue="0") Integer page, 
			@RequestParam(value="linesPerPage", defaultValue="10") Integer linesPerPage, 
			@RequestParam(value="orderBy", defaultValue="razao") String orderBy, 
			@RequestParam(value="direction", defaultValue="ASC") String direction) {
		
		return super.findPage(page, linesPerPage, orderBy, direction);
	}	
	
	@SuppressWarnings("unchecked")
	@GetMapping("/{id}")
	public ResponseEntity<Empresa> buscarPorId(@PathVariable long id) {
		return (ResponseEntity<Empresa>) super.buscarPorId(id);
	}

	@SuppressWarnings("unchecked")
	@PostMapping
	public ResponseEntity<Empresa> salvar(@RequestBody Empresa empresa) {
		return (ResponseEntity<Empresa>) super.salvar(empresa);
	}
	
	@SuppressWarnings("unchecked")
	@PutMapping("/{id}")
	public ResponseEntity<Empresa> editar(@PathVariable long id , @RequestBody Empresa empresa) {
		return (ResponseEntity<Empresa>) super.editar(id, empresa);
	}
		
	@SuppressWarnings("unchecked")
	@DeleteMapping("/{id}")
	public ResponseEntity<Empresa> excluir(@PathVariable long id) {
		return (ResponseEntity<Empresa>) super.excluir(id);
	}
		 
}
