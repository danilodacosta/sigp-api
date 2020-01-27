package com.semantic.sigp.api.v1.model;

import java.time.LocalDate;

import javax.persistence.*;

import javax.persistence.Column;

import com.semantic.sigp.api.core.model.BaseModel;
import com.semantic.sigp.api.v1.enums.TipoSituacaoEnum;

import lombok.EqualsAndHashCode;

@Entity
@Table(name = "sigp_atendimento")
@EqualsAndHashCode
public class Atendimento extends BaseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 11, nullable = false)
	private Integer protocolo;

	private LocalDate data;

	@Column
	@Enumerated(EnumType.STRING)
	private TipoSituacaoEnum situacao;
	
	@Column(length = 25, nullable = false)
	private String atendente;

	@ManyToOne
	@JoinColumn(name = "id_categoria", foreignKey = @ForeignKey(name = "atendimento_categoria_fk"))
	private Categoria categoria;

	private LocalDate prazo;

	@ManyToOne
	@JoinColumn(name = "id_visitante", foreignKey = @ForeignKey(name = "atendimento_visitante_fk"))
	private Visitante visitante;

	private String solicitacao;

	@ManyToOne
	@JoinColumn(name = "id_comunidade", foreignKey = @ForeignKey(name = "atendimento_comunidade_fk"))
	private Comunidade comunidade;
	
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
	
	public TipoSituacaoEnum getSituacao() {
		return situacao;
	}

	public void setSituacao(TipoSituacaoEnum situacao) {
		this.situacao = situacao;
	}

	public String getAtendente() {
		return atendente;
	}

	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}
	
	public LocalDate getPrazo() {
		return prazo;
	}

	public void setPrazo(LocalDate prazo) {
		this.prazo = prazo;
	}
	
	public Visitante getVisitante() {
		return visitante;
	}

	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}

	public String getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(String solicitacao) {
		this.solicitacao = solicitacao;
	}

	public Comunidade getComunidade() {
		return comunidade;
	}

	public void setComunidade(Comunidade comunidade) {
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}	
	
}
