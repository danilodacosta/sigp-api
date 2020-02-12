package com.semantic.sigp.api.v1.enums;

public enum TipoPessoaEnum {

	PESSOA_FISICA ("Pessoa Física"),
	PESSOA_JURIDICA ("Pessoa Jurídica");
    
	private String value;

    TipoPessoaEnum(String value) {
		  this.value = value;
    }

    public String getValue() {
		  return value;
    }
}
