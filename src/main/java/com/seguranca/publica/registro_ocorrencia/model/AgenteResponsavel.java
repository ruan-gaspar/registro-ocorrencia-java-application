package com.seguranca.publica.registro_ocorrencia.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class AgenteResponsavel {
    private UUID id;
    private String nomeCompleto;
    private String cargo;
}
