package com.semantic.sigp.api.v1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.semantic.sigp.api.core.service.BaseServiceImpl;
import com.semantic.sigp.api.v1.model.Comunidade;
import com.semantic.sigp.api.v1.repository.ComunidadeRepository;

@Service
public class ComunidadeServiceImpl extends BaseServiceImpl<Comunidade> implements IComunidadeService {

	@Autowired
	private ComunidadeRepository repository;

	@Override
	protected ComunidadeRepository getRepository() {
		return repository;
	}

}