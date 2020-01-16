package com.semantic.sigp.api.v1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.semantic.sigp.api.core.service.BaseServiceImpl;
import com.semantic.sigp.api.v1.model.Categoria;
import com.semantic.sigp.api.v1.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria> implements ICategoriaService {

	@Autowired
	private CategoriaRepository repository;

	@Override
	protected CategoriaRepository getRepository() {
		return repository;
	}

}