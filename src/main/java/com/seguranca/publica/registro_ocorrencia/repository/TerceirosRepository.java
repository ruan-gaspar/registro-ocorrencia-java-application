package com.seguranca.publica.registro_ocorrencia.repository;

import com.seguranca.publica.registro_ocorrencia.model.Ocorrencia;
import com.seguranca.publica.registro_ocorrencia.model.Terceiros;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TerceirosRepository extends JpaRepository<Terceiros, UUID> {
    List<Terceiros> findByNomeCompletoContainingIgnoreCase(String nome);
}
