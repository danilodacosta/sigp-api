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
@Table(name = "sigp_memorando")
public class Memorando extends BaseModel { 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 15, nullable = false)
	private String situacao;
	
	@Column(length = 40, nullable = false)
	private String solicitante;

	@Column(length = 6, nullable = false)
	private Integer numero;

	@ManyToOne
	@JoinColumn(name = "id_categoria", foreignKey = @ForeignKey(name = "memorando_categoria_fk"))
	private Categoria categoria;
	
	@Column(length = 40, nullable = false)
	private String destinatario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}		
	
}
