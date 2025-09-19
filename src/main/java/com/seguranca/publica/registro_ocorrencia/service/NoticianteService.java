package com.seguranca.publica.registro_ocorrencia.service;

import com.seguranca.publica.registro_ocorrencia.model.Noticiante;
import com.seguranca.publica.registro_ocorrencia.model.Ocorrencia;
import com.seguranca.publica.registro_ocorrencia.repository.NoticianteRepository;
import com.seguranca.publica.registro_ocorrencia.repository.OcorrenciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class NoticianteService {
    private final NoticianteRepository noticianteRepository;

    public NoticianteService(NoticianteRepository noticianteRepository) {
        this.noticianteRepository = noticianteRepository;
    }
    public List<Noticiante> listarTodos() {
        return (List<Noticiante>) noticianteRepository.findAll();
    }

    public Optional<Noticiante> buscarNoticiantePorId(UUID id) {
        return noticianteRepository.findById(id);
    }
    public Noticiante cadastrarNoticiante(Noticiante noticiante) {
        return noticianteRepository.save(noticiante);
    }
    public Noticiante atualizarCadsatroNoticiante(Noticiante noticiante) {
        return noticianteRepository.save(noticiante);
    }
    public void excluirCadastroNoticiante(UUID id) {
        noticianteRepository.deleteById(id);
    }
}
