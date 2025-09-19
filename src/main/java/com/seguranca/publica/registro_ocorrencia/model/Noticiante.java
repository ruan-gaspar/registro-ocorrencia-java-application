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

public class Noticiante {
    @Id
    @GeneratedValue
    private UUID id;
    private String nomeCompleto;
    private String cpf;
    private String rg;
    private int idade;
    private String endereco;
    private String telefone;
    private String email;
    private String estadoCivil;
}
