package com.semantic.sigp.api.v1.repository;

import org.springframework.stereotype.Repository;

import com.semantic.sigp.api.core.repository.IBaseRepository;
import com.semantic.sigp.api.v1.model.Representante;

@Repository
public interface RepresentanteRepository extends IBaseRepository<Representante, Long> {
//@Transactional(readOnly=true)
}
