package com.semantic.sigp.api.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

public interface BaseService<T> {

	Optional<T> findById(T id);
	List<T> findAll();
	Page<T> findAllPaginated(int page, int size);
	T save(T t);
	T update(T t);
	void delete(T t);	
}
