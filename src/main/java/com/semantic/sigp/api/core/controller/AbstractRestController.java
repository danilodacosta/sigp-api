package com.semantic.sigp.api.core.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.semantic.sigp.api.core.model.BaseModel;
import com.semantic.sigp.api.core.service.IBaseService;

public abstract class AbstractRestController<T extends BaseModel> {

	protected abstract IBaseService<T> getService();

	public ResponseEntity<List<?>> listar() {
		return ResponseEntity.ok(getService().findAll());
	}

	public ResponseEntity<?> buscarPorCodigo(long id) {

		Optional<T> t = getService().findById(id);

		if (!t.isPresent()) {
			// throw new ApiException("Página não encontrada", 404);
			ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(t.get());
	}

	public ResponseEntity<?> salvar(T t) {

		getService().save(t);

		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	public ResponseEntity<?> editar(Long id, T t) {
		getService().save(t);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

	public ResponseEntity<?> excluir(long id) {
		Optional<T> t = getService().findById(id);

		if (!t.isPresent()) {
			// throw new ApiException("Página não encontrada", 404);
			ResponseEntity.notFound().build();
		}

		getService().delete(t.get());

		return ResponseEntity.noContent().build();
	}
}
