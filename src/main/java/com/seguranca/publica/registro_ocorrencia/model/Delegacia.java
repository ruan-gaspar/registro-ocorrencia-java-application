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
@Table(name = "DELEGACIA")
public class Delegacia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private String delegadoResponsavel;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false)
    private String telefone;

}
