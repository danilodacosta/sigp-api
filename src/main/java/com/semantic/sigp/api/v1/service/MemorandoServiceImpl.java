package com.semantic.sigp.api.v1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.semantic.sigp.api.core.service.BaseServiceImpl;
import com.semantic.sigp.api.v1.model.Memorando;
import com.semantic.sigp.api.v1.repository.MemorandoRepository;

@Service
public class MemorandoServiceImpl extends BaseServiceImpl<Memorando> implements IMemorandoService {

	@Autowired
	private MemorandoRepository repository;

	@Override
	protected MemorandoRepository getRepository() {
		return repository;
	}

}