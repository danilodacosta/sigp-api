package com.semantic.sigp.api.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.semantic.sigp.api.core.model.BaseModel;

@NoRepositoryBean
public interface BaseRepository<T extends BaseModel, ID extends Serializable> extends JpaRepository<T, ID> {
}