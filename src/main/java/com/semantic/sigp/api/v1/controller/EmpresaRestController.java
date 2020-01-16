package com.semantic.sigp.api.v1.controller;

import com.semantic.sigp.api.core.controller.AbstractRestController;
import com.semantic.sigp.api.core.service.IBaseService;
import com.semantic.sigp.api.v1.model.Empresa;
import com.semantic.sigp.api.v1.service.IEmpresaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@SuppressWarnings("unchecked")
	@GetMapping
	public List<Empresa> listar() {
		return (List<Empresa>) super.listar();
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
	public ResponseEntity<Empresa> atualizar(@PathVariable long id , @RequestBody Empresa empresa) {
		return (ResponseEntity<Empresa>) super.editar(id, empresa);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Empresa> excluir(@PathVariable long id) {
		return (ResponseEntity<Empresa>) super.excluir(id);
	}
	
	 
}
