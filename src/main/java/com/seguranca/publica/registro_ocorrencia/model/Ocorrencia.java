package com.seguranca.publica.registro_ocorrencia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ocorrencia {
    @Id
    @GeneratedValue
    private UUID id; // Vamos usar para localizar cada registro
    private String titulo; // Nome resumido da ocorrência
    private String descricao; // relato do noticiante registrado por agente habilitado
    private LocalDateTime dataRegistro;
    private Integer numeroOcorrencia; // fins de registro
    private Integer codigoOcorrencia; // códigos para consulta futura. Ex. Art. 157, art 171, etc
    private String localOcorrencia; // Endereço obrigatório do fato relatado
    private boolean statusConcluido; // Ocorrencia aprovada/efetivada ou em aberto (faltam dados? Informações conflitantes? Etc)
    private String categoria; // Palavra chave associada ao codigoOcorrencia para consulta futura. Ex.: furto, assalto, perda de documentos, sinistro veicular, etc
}
