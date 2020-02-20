package com.semantic.sigp.api.v1.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.semantic.sigp.api.core.model.BaseModel;
import com.semantic.sigp.api.v1.enums.SexoEnum;
import com.semantic.sigp.api.v1.enums.TipoPessoaEnum;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Entity
@Table(name = "sigp_visitante")
public class Visitante extends BaseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(length = 50, nullable = false)
	private String cpf;
	
	@Column(length = 10, nullable = false)
	private String rg;
	
	@Column(length = 14, nullable = false)
	private String celular;
	
	@Column(length = 50, nullable = false)
	private String email;
	
	@Column(nullable = false, length=50)
    @Enumerated(EnumType.STRING)
	private SexoEnum sexo;
	
	@Column(nullable = false, length=50)
    @Enumerated(EnumType.STRING)
	private TipoPessoaEnum tipo;
	
	@Embedded
	private Endereco endereco;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoPessoaEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoPessoaEnum tipo) {
		this.tipo = tipo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public SexoEnum getSexo() {
		return sexo;
	}

	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
	}

}
