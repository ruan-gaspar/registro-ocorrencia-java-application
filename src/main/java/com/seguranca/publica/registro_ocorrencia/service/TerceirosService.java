package com.seguranca.publica.registro_ocorrencia.service;
import org.springframework.transaction.annotation.Transactional;
import com.seguranca.publica.registro_ocorrencia.model.Terceiros;
import com.seguranca.publica.registro_ocorrencia.repository.TerceirosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TerceirosService {
    private final TerceirosRepository terceirosRepository;

    public TerceirosService(TerceirosRepository terceirosRepository) {
        this.terceirosRepository = terceirosRepository;
    }
    @Transactional
    public List<Terceiros> listarTodos() {
        return (List<Terceiros>) terceirosRepository.findAll();
    }
    @Transactional
    public List<Terceiros> buscarPorNome(String nome) {
        return terceirosRepository.findByNomeCompletoContainingIgnoreCase(nome);
    }
    @Transactional
    public Optional<Terceiros> buscarTerceirosPorId(UUID id) {
        return terceirosRepository.findById(id);
    }
    @Transactional
    public Terceiros cadastrarTerceiro(Terceiros terceiros) {
        return terceirosRepository.save(terceiros);
    }
    @Transactional
    public Terceiros atualizarTerceiros(Terceiros terceiros) {
        return terceirosRepository.save(terceiros);
    }
    @Transactional
    public void excluirCadastroTerceiros(UUID id) {
        terceirosRepository.deleteById(id);
    }
}
