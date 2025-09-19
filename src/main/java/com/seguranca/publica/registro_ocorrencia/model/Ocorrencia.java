package com.seguranca.publica.registro_ocorrencia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "OCORRENCIA")
public class Ocorrencia {
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(updatable = false, nullable = false)
    private UUID id; // Vamos usar para localizar cada registro
    @Column(nullable = false)
    private String titulo; // Nome resumido da ocorrência
    @Column(nullable = false)
    private String descricao; // relato do noticiante registrado por agente habilitado
    @Column(nullable = false)
    private LocalDateTime dataRegistro;
    @Column(nullable = false)
    private Integer numeroOcorrencia; // fins de registro
    @Column(nullable = false)
    private Integer codigoOcorrencia; // códigos para consulta futura. Ex. Art. 157, art 171, etc
    @Column(nullable = false)
    private String localOcorrencia; // Endereço obrigatório do fato relatado
    @Column(nullable = false)
    private boolean statusConcluido; // Ocorrencia aprovada/efetivada ou em aberto (faltam dados? Informações conflitantes? Etc)
    @Column(nullable = false)
    private String categoria; // Palavra chave associada ao codigoOcorrencia para consulta futura. Ex.: furto, assalto, perda de documentos, sinistro veicular, etc
}
