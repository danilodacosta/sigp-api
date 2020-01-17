package com.semantic.sigp.api.v1.service;

import com.semantic.sigp.api.v1.model.dto.EnderecoWeb;

public interface IConsultaCEPService {

    public EnderecoWeb getEnderecoWeb(String cep);

}