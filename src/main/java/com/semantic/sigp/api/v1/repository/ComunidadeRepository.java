package com.semantic.sigp.api.v1.repository;

import org.springframework.stereotype.Repository;

import com.semantic.sigp.api.core.repository.IBaseRepository;
import com.semantic.sigp.api.v1.model.Comunidade;

@Repository
public interface ComunidadeRepository extends IBaseRepository<Comunidade, Long> {
//@Transactional(readOnly=true)
}
