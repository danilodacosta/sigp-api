package com.semantic.sigp.api.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

public interface IBaseService<T> {

	Optional<T> findById(long id);
	List<T> findAll();
	Page<T> findAllPaginated(Integer page, Integer linesPerPage, String orderBy, String direction);
	T save(T t);	
	void delete(T t);
	Long count();		
}
