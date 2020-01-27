package com.semantic.sigp.api.v1.enums;

public enum TipoSituacaoEnum {

    PENDENTE("Pendente"),
    DEFERIDA("Deferida"),
	INDEFERIDA("Indeferida"),
	ATENDIDO("Atendido"),
	PROCESSADO("Processado"); 
	
    private String value;

    TipoSituacaoEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
	
}
