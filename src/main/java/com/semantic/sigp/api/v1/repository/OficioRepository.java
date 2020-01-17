package com.semantic.sigp.api.v1.repository;

import org.springframework.stereotype.Repository;
import com.semantic.sigp.api.v1.model.Oficio;
import com.semantic.sigp.api.core.repository.IBaseRepository;

@Repository
public interface OficioRepository extends IBaseRepository<Oficio, Long> {
   
}
