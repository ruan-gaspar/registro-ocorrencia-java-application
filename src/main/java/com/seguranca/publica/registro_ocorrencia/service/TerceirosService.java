package com.seguranca.publica.registro_ocorrencia.service;

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
    public Optional<Terceiros> buscarTerceirosPorId(UUID id) {
        return terceirosRepository.findById(id);
    }
    public Terceiros cadastrarTerceiro(Terceiros terceiros) {
        return terceirosRepository.save(terceiros);
    }
    public Terceiros atualizarTerceiros(Terceiros terceiros) {
        return terceirosRepository.save(terceiros);
    }
    public void excluirCadsatroTerceiros(UUID id) {
        terceirosRepository.deleteById(id);
    }
}
