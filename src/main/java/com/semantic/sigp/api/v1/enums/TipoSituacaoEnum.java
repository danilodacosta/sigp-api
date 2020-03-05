package com.semantic.sigp.api.v1.enums;

public enum TipoSituacaoEnum {
	
	ATENDIDO("Atendido"),
	AGENDADO("Agendado"),
	DEFERIDO("Deferido"),
	DESPACHADO("Despachado"),
    PENDENTE("Pendente"),
    PROCESSADO("Processado"), 
	INDEFERIDO("Indeferido");
    
	private String value;

    TipoSituacaoEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
	
}
