package com.semantic.sigp.api.v1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.semantic.sigp.api.core.service.BaseServiceImpl;
import com.semantic.sigp.api.v1.model.Empresa;
import com.semantic.sigp.api.v1.repository.EmpresaRepository;

@Service
public class EmpresaServiceImpl extends BaseServiceImpl<Empresa> implements IEmpresaService {

	@Autowired
	private EmpresaRepository repository;

	@Override
	protected EmpresaRepository getRepository() {
		return repository;
	}

}