package com.semantic.sigp.api.v1.enums;

public enum SexoEnum {

	FEMININO("Feminino"),
	MASCULINO("Masculino");
	
    private String value;

    SexoEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
	
}
