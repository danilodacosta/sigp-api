package com.semantic.sigp.api.v1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.semantic.sigp.api.core.service.BaseServiceImpl;
import com.semantic.sigp.api.v1.model.Oficio;
import com.semantic.sigp.api.v1.repository.OficioRepository;

@Service
public class OficioServiceImpl extends BaseServiceImpl<Oficio> implements IOficioService {

	@Autowired
	private OficioRepository repository;

	@Override
	protected OficioRepository getRepository() {
		return repository;
	}

}