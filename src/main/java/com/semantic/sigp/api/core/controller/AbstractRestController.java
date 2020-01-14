package com.semantic.sigp.api.core.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.semantic.sigp.api.core.model.BaseModel;
import com.semantic.sigp.api.core.service.IBaseService;

public abstract class AbstractRestController<T extends BaseModel> {

	protected abstract IBaseService<T> getService();

	 private String entityName;


        public ResponseEntity<List<T>> listar(){
	        return ResponseEntity.ok(getService().findAll());
	    }

	 
	/*
    public ResponseEntity<T> visualizar(long id){
        log.debug("REST request to get {} : {}",getEntityName(), id);
        Optional<T> t = getService().findById(id);

        if (!t.isPresent())
            throw new ApiException("Página não encontrada", 404);

        return ResponseEntity.ok(t.get());
    }

    public ResponseEntity cadastrar(T t){
        log.debug("REST request to save "+getEntityName()+" : {}", t);

        getService().save(t);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public ResponseEntity editar(Long id, T t){
        log.debug("REST request to update " + getEntityName() +" : {}", t);
        getService().save(t);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    public ResponseEntity excluir(long id){
        log.debug("REST request to delete {} : {}", getEntityName(), id);
        Optional<T> t = getService().findById(id);

        if (!t.isPresent())
            throw new ApiException("Página não encontrada", 404);

        try {
            getService().remove(t.get());
        }catch (RollbackException | UnexpectedRollbackException | DataIntegrityViolationException | ConstraintViolationException | org.hibernate.exception.ConstraintViolationException e) {
            throw new ApiException("O registro possui vínculos no sistema e não pode ser excluído.", 400);
        }


        return ResponseEntity.noContent().build();
    }

    protected String getEntityName(){
        if (entityName == null)
            entityName = ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getSimpleName();

        return entityName;
    }*/
	
}
