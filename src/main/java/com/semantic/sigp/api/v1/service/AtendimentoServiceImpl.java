package com.semantic.sigp.api.v1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.semantic.sigp.api.core.service.BaseServiceImpl;
import com.semantic.sigp.api.v1.model.Atendimento;
import com.semantic.sigp.api.v1.repository.AtendimentoRepository;

@Service
public class AtendimentoServiceImpl extends BaseServiceImpl<Atendimento> implements IAtendimentoService {

	@Autowired
	private AtendimentoRepository repository;

	@Override
	protected AtendimentoRepository getRepository() {
		return repository;
	}

}