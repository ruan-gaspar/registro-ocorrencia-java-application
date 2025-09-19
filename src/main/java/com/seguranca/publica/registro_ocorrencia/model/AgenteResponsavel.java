package com.seguranca.publica.registro_ocorrencia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "AGENTE_RESPONSAVEL")
public class AgenteResponsavel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private String nomeCompleto;
    @Column(nullable = false)
    private String cargo;
}
