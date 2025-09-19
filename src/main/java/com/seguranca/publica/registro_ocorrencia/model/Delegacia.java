package com.seguranca.publica.registro_ocorrencia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Delegacia {
    @Id
    @GeneratedValue
    private UUID id;
    private String titulo;
    private String delegadoResponsavel;
    private String endereco;
    private String telefone;

}
