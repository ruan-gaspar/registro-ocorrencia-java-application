package com.seguranca.publica.registro_ocorrencia.service;

import com.seguranca.publica.registro_ocorrencia.model.AgenteResponsavel;
import com.seguranca.publica.registro_ocorrencia.model.Ocorrencia;
import com.seguranca.publica.registro_ocorrencia.repository.AgenteResponsavelRepository;
import com.seguranca.publica.registro_ocorrencia.repository.OcorrenciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AgenteResponsavelService {
    private final AgenteResponsavelRepository agenteResponsavelRepository;

    public AgenteResponsavelService(AgenteResponsavelRepository agenteResponsavelRepository) {
        this.agenteResponsavelRepository = agenteResponsavelRepository;
    }
    public List<AgenteResponsavel> listarAgentes() {
        return agenteResponsavelRepository.findAll();
    }
    public Optional<AgenteResponsavel> buscarAgentePorId(UUID id) {
        return agenteResponsavelRepository.findById(id);
    }
    public AgenteResponsavel cadastrarAgente(AgenteResponsavel agenteResponsavel) {
        return agenteResponsavelRepository.save(agenteResponsavel);
    }
    public AgenteResponsavel atualizarAgentes(AgenteResponsavel agenteResponsavel) {
        return agenteResponsavelRepository.save(agenteResponsavel);
    }
    public void excluirAgente(UUID id) {
        agenteResponsavelRepository.deleteById(id);
    }
}
