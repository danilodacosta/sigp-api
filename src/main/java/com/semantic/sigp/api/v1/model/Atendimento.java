package com.semantic.sigp.api.v1.model;

import java.time.LocalDate;

import javax.persistence.Entity;

import com.semantic.sigp.api.core.model.BaseModel;


public class Atendimento extends BaseModel{

	private Long id;
	
	private Integer protocolo;
	
	private LocalDate data;
	
	private String situacao;
	
	private String atendente;
	
	private String categoria;
	
	private LocalDate prazo;
	
	private String visitante;
	
	private String solicitacao;
	
	private String comunidade;
	
	private String indicacao;
	
	private Integer flag;
	
}
