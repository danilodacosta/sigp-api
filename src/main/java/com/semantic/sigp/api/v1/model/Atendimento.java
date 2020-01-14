package com.semantic.sigp.api.v1.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

import com.semantic.sigp.api.core.model.BaseModel;

import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode
public class Atendimento extends BaseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 11, nullable = false)
	private Integer protocolo;

	private LocalDate data;

	@Column(length = 10, nullable = false)
	private String situacao;
	
	@Column(length = 25, nullable = false)
	private String atendente;

	@Column(length = 15, nullable = false)
	private String categoria;

	private LocalDate prazo;

	@Column(length = 6, nullable = false)
	private String visitante;

	private String solicitacao;

	private String comunidade;
	
	@Column(length = 30, nullable = false)
	private String indicacao;

	private Integer flag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Integer protocolo) {
		this.protocolo = protocolo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getAtendente() {
		return atendente;
	}

	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public LocalDate getPrazo() {
		return prazo;
	}

	public void setPrazo(LocalDate prazo) {
		this.prazo = prazo;
	}

	public String getVisitante() {
		return visitante;
	}

	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}

	public String getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(String solicitacao) {
		this.solicitacao = solicitacao;
	}

	public String getComunidade() {
		return comunidade;
	}

	public void setComunidade(String comunidade) {
		this.comunidade = comunidade;
	}

	public String getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}	

}
