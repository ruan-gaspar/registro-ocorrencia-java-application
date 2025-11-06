package com.seguranca.publica.registro_ocorrencia.service;
import com.seguranca.publica.registro_ocorrencia.model.Agente;
import com.seguranca.publica.registro_ocorrencia.repository.AgenteRepository;
import org.springframework.transaction.annotation.Transactional;
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
    @Transactional
    public List<Noticiante> listarTodos() {
        return (List<Noticiante>) noticianteRepository.findAll();
    }

    @Transactional
    public List<Noticiante> buscarNoticiantePorNome(String nome) {
        return noticianteRepository.findByNomeCompletoContainingIgnoreCase(nome);
    }
    @Transactional
    public Optional<Noticiante> buscarNoticiantePorId(UUID id) {
        return noticianteRepository.findById(id);
    }
    @Transactional
    public Noticiante cadastrarNoticiante(Noticiante noticiante) {
        return noticianteRepository.save(noticiante);
    }
    @Transactional
    public Noticiante atualizarCadastroNoticiante(Noticiante noticiante) {
        return noticianteRepository.save(noticiante);
    }
   @Transactional
    public void excluirCadastroNoticiante(UUID id) {
        noticianteRepository.deleteById(id);
    }
}
