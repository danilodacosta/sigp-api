package com.semantic.sigp.api.v1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.semantic.sigp.api.core.service.BaseServiceImpl;
import com.semantic.sigp.api.v1.model.Visitante;
import com.semantic.sigp.api.v1.repository.VisitanteRepository;

@Service
public class VisitanteServiceImpl extends BaseServiceImpl<Visitante> implements IVisitanteService {

	@Autowired
	private VisitanteRepository repository;

	@Override
	protected VisitanteRepository getRepository() {
		return repository;
	}

}