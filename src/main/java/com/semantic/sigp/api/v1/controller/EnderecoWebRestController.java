package com.semantic.sigp.api.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semantic.sigp.api.v1.model.dto.EnderecoWeb;
import com.semantic.sigp.api.v1.service.IConsultaCEPService;

@RestController
@RequestMapping("v1/endereco-web/")
@CrossOrigin("*")
public class EnderecoWebRestController {

    @Autowired
    private IConsultaCEPService consultaCEPService;

    @GetMapping("/busca-cep/{cep}")
    public ResponseEntity<EnderecoWeb> visualizar(@PathVariable String cep) {
        EnderecoWeb enderecoWeb = consultaCEPService.getEnderecoWeb(cep);

        return ResponseEntity.ok(enderecoWeb);
    }

}
