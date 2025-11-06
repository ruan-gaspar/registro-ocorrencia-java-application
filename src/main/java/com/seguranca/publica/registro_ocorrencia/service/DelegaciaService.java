package com.seguranca.publica.registro_ocorrencia.service;
import com.seguranca.publica.registro_ocorrencia.model.Agente;
import org.springframework.transaction.annotation.Transactional;
import com.seguranca.publica.registro_ocorrencia.model.Delegacia;
import com.seguranca.publica.registro_ocorrencia.model.Ocorrencia;
import com.seguranca.publica.registro_ocorrencia.repository.DelegaciaRepository;
import com.seguranca.publica.registro_ocorrencia.repository.OcorrenciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DelegaciaService {
    private final DelegaciaRepository delegaciaRepository;

    public DelegaciaService(DelegaciaRepository delegaciaRepository) {
        this.delegaciaRepository = delegaciaRepository;
    }
    @Transactional
    public List<Delegacia> listarTodasDelegacias() {
        return delegaciaRepository.findAll();
    }
    @Transactional
    public Optional<Delegacia> buscarDelegaciaPorId(UUID id) {
        return delegaciaRepository.findById(id);
    }
    @Transactional
    public List<Delegacia> buscarDelegaciaPorNome(String nome) {
        return delegaciaRepository.findByTituloContainingIgnoreCase(nome);
    }
    @Transactional
    public Delegacia cadastrarDelegacia(Delegacia delegacia) {
        return delegaciaRepository.save(delegacia);
    }
    @Transactional
    public Delegacia atualizarCadastroDelegacia(Delegacia delegacia) {
        return delegaciaRepository.save(delegacia);
    }
    @Transactional
    public void excluirCadastroDelegacia(UUID id) {
        delegaciaRepository.deleteById(id);
    }
}
