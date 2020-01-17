package com.semantic.sigp.api.v1.repository;

import org.springframework.stereotype.Repository;
import com.semantic.sigp.api.v1.model.Memorando;
import com.semantic.sigp.api.core.repository.IBaseRepository;

@Repository
public interface MemorandoRepository extends IBaseRepository<Memorando, Long> {
   
}
