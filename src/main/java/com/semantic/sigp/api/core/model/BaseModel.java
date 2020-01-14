package com.semantic.sigp.api.core.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseModel {
	
	 public abstract Long getId();
	
}
