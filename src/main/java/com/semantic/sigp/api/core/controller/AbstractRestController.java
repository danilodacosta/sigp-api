package com.semantic.sigp.api.core.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.semantic.sigp.api.core.model.BaseModel;
import com.semantic.sigp.api.core.service.IBaseService;

public abstract class AbstractRestController<T extends BaseModel> {

	protected abstract IBaseService<T> getService();

	protected List<?> listar() {
		return getService().findAll();
	}

	
	protected Page<?> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		
		Page<?> list = getService().findAllPaginated(page, linesPerPage, orderBy, direction);

		return list;
	}
	
	
	protected ResponseEntity<?> buscarPorId(long id) {

		Optional<T> entity = getService().findById(id);

		if (!entity.isPresent()) {
			// throw new ApiException("Página não encontrada", 404);
			ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(entity.get());
	}

	protected ResponseEntity<?> salvar(T entity) {

		getService().save(entity);

		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	protected ResponseEntity<?> editar(Long id, T t) {
				
		Optional<T> entity  = getService().findById(id);
		
		if (!entity.isPresent()) {
			//ResponseEntity.notFound().build();
			throw new EmptyResultDataAccessException(1);
		}
				
		BeanUtils.copyProperties(t, entity, "id");
		
		getService().save(t);
		
		return ResponseEntity.ok(t);
	}

	protected ResponseEntity<?> excluir(long id) {
		Optional<T> entity = getService().findById(id);

		if (!entity.isPresent()) {
			throw new EmptyResultDataAccessException(1);
		}

		getService().delete(entity.get());

		return ResponseEntity.noContent().build();
	}	
	
}
