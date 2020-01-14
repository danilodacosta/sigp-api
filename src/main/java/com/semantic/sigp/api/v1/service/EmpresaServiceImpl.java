package com.semantic.sigp.api.v1.service;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.semantic.sigp.api.core.service.BaseServiceImpl;
import com.semantic.sigp.api.v1.model.Empresa;

@Service
public class EmpresaServiceImpl extends BaseServiceImpl<Empresa> implements IEmpresaService {

	@Override
	public Optional<Empresa> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empresa> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Empresa> findAllPaginated(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empresa save(Empresa t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empresa update(Empresa t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Empresa t) {
		// TODO Auto-generated method stub
		
	}

}