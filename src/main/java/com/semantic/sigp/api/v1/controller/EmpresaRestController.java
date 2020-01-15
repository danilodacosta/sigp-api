package com.semantic.sigp.api.v1.controller;

import com.semantic.sigp.api.core.controller.AbstractRestController;
import com.semantic.sigp.api.core.service.IBaseService;
import com.semantic.sigp.api.v1.model.Empresa;
import com.semantic.sigp.api.v1.service.IEmpresaService;
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
	@PostMapping
	public ResponseEntity<Empresa> salvar(@RequestBody Empresa empresa) {
		return (ResponseEntity<Empresa>) super.salvar(empresa);
	}

	/*
	 * 
	 * @Override
	 * 
	 * @GetMapping("/{id}") public ResponseEntity<Empresa> visualizar(@PathVariable
	 * long id) { return null;//super.visualizar(id); }
	 * 
	 * @Override
	 * 
	 * @PutMapping("/{id}") public ResponseEntity editar(@PathVariable Long
	 * id, @RequestBody Empresa empresa) { if (!id.equals(empresa.getId())) return
	 * ResponseEntity.notFound().build(); return null; // return super.editar(id,
	 * empresa); }
	 * 
	 * @Override
	 * 
	 * @DeleteMapping("/{id}") public ResponseEntity excluir(@PathVariable long id)
	 * { return null;//return super.excluir(id); }
	 */
}
