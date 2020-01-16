package com.semantic.sigp.api.v1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.semantic.sigp.api.core.service.BaseServiceImpl;
import com.semantic.sigp.api.v1.model.Representante;
import com.semantic.sigp.api.v1.repository.RepresentanteRepository;

@Service
public class RepresentanteServiceImpl extends BaseServiceImpl<Representante> implements IRepresentanteService {

	@Autowired
	private RepresentanteRepository repository;

	@Override
	protected RepresentanteRepository getRepository() {
		return repository;
	}

}