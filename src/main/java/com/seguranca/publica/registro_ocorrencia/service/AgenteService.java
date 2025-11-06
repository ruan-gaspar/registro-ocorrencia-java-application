package com.seguranca.publica.registro_ocorrencia.service;
import org.springframework.transaction.annotation.Transactional;
import com.seguranca.publica.registro_ocorrencia.model.Agente;
import com.seguranca.publica.registro_ocorrencia.repository.AgenteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AgenteService {
    private final AgenteRepository agenteRepository;

    public AgenteService(AgenteRepository agenteRepository) {
        this.agenteRepository = agenteRepository;
    }
    @Transactional
    public List<Agente> listarAgente() {
        return agenteRepository.findAll();
    }

    @Transactional
    public List<Agente> buscarPorNome(String nome) {
        return agenteRepository.findByNomeCompletoContainingIgnoreCase(nome);
    }

    @Transactional
    public Optional<Agente> buscarAgentePorId(UUID id) {
        return agenteRepository.findById(id);
    }
    @Transactional
    public Agente cadastrarAgente(Agente agente) {
        return agenteRepository.save(agente);
    }
    @Transactional
    public Agente atualizarAgentes(Agente agente) {
        return agenteRepository.save(agente);
    }
    @Transactional
    public void excluirAgente(UUID id) {
        agenteRepository.deleteById(id);
    }
}
