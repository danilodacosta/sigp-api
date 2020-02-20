package com.semantic.sigp.api.v1.enums;

public enum TipoSituacaoEnum {

    PENDENTE("Pendente"),
    DEFERIDO("Deferido"),
	INDEFERIDO("Indeferido"),
	ATENDIDO("Atendido"),
	PROCESSADO("Processado"), 
	DESPACHADO("Despachado");
    
	private String value;

    TipoSituacaoEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
	
}
