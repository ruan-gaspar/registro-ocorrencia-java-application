package com.seguranca.publica.registro_ocorrencia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {
    @GetMapping
    public String Ocorrencia() {
        return "Ocorrência registrada.";
    }
}
