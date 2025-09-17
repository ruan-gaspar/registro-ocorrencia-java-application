package com.seguranca.publica.registro_ocorrencia.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ocorrencia {
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
