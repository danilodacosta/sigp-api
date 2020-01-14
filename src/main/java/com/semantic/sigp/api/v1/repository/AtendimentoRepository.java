package com.semantic.sigp.api.v1.repository;

import org.springframework.stereotype.Repository;
import com.semantic.sigp.api.v1.model.Atendimento;
import com.semantic.sigp.api.core.repository.IBaseRepository;

@Repository
public interface AtendimentoRepository extends IBaseRepository<Atendimento, Long> {
   
}
