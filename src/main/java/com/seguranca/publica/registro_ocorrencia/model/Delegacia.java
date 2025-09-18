package com.seguranca.publica.registro_ocorrencia.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Delegacia {
    private UUID id;
    private String titulo;
    private String delegadoResponsavel;
    private String endereco;
    private String telefone;

}
