package com.semantic.sigp.api.v1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.semantic.sigp.api.core.service.BaseServiceImpl;
import com.semantic.sigp.api.v1.model.Propositura;
import com.semantic.sigp.api.v1.repository.ProposituraRepository;

@Service
public class ProposituraServiceImpl extends BaseServiceImpl<Propositura> implements IProposituraService {

	@Autowired
	private ProposituraRepository repository;

	@Override
	protected ProposituraRepository getRepository() {
		return repository;
	}

}