package com.seguranca.publica.registro_ocorrencia.service;

import com.seguranca.publica.registro_ocorrencia.model.Ocorrencia;
import com.seguranca.publica.registro_ocorrencia.repository.OcorrenciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OcorrenciaService {
    private final OcorrenciaRepository ocorrenciaRepository;

    public OcorrenciaService(OcorrenciaRepository ocorrenciaRepository) {
        this.ocorrenciaRepository = ocorrenciaRepository;
    }
    public List<Ocorrencia> listarTodos() {
        return ocorrenciaRepository.findAll();
    }
    public Optional<Ocorrencia> buscarPorId(UUID id) {
        return ocorrenciaRepository.findById(id);
    }
    public Ocorrencia criar(Ocorrencia ocorrencia) {
        return ocorrenciaRepository.save(ocorrencia);
    }
    public Ocorrencia atualizar(Ocorrencia ocorrencia) {
        return ocorrenciaRepository.save(ocorrencia);
    }
    public void excluir(UUID id) {
        ocorrenciaRepository.deleteById(id);
    }
}
