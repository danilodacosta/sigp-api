package com.semantic.sigp.api.v1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	@Column(length = 60, nullable = false)
	private String distrito;
	
	@ManyToOne
	@JoinColumn(name = "id_representante", foreignKey = @ForeignKey(name = "comunidade_representante_fk"))
	private Representante representante;

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

	public Representante getRepresentante() {
		return representante;
	}

	public void setRepresentante(Representante representante) {
		this.representante = representante;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	
}
