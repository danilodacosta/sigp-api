package com.semantic.sigp.api.v1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.semantic.sigp.api.core.model.BaseModel;
import com.semantic.sigp.api.v1.enums.TipoSituacaoEnum;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Entity
@Table(name = "sigp_propositura")
public class Propositura extends BaseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length=20)
    @Enumerated(EnumType.STRING)
	private TipoSituacaoEnum situacao;
	
	@Column(length = 50, nullable = false)
	private String solicitante;

	@Column(length = 15, nullable = false)
	private String tipo;
	
	@Column(length = 255, nullable = false)
	private String assunto;
		
	@ManyToOne
	@JoinColumn(name = "id_categoria", foreignKey = @ForeignKey(name = "propositura_categoria_fk"))
	private Categoria categoria;
	
	@Column(length = 30, nullable = false)
	private String autoria;
		
	@Column(length = 100, nullable = false)
	private String resumo;
	
	@Column(length = 50, nullable = false)
	private String rua;
	
	@Column(length = 20, nullable = false)
	private String bairro;
	
	@Column(length = 30, nullable = false)
	private String protocolo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public TipoSituacaoEnum getSituacao() {
		return situacao;
	}

	public void setSituacao(TipoSituacaoEnum situacao) {
		this.situacao = situacao;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

		
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getAutoria() {
		return autoria;
	}

	public void setAutoria(String autoria) {
		this.autoria = autoria;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	
	
}
