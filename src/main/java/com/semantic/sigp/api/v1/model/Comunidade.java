package com.semantic.sigp.api.v1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.semantic.sigp.api.core.model.BaseModel;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Entity
@Table(name = "sigp_comunidade")
public class Comunidade extends BaseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 45, nullable = false)
	private String nome;
	
	@Column(length = 30, nullable = false)
	private String bairro;

	@Column(length = 50, nullable = false)
	private String representante;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}	
	
}
