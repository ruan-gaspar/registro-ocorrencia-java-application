package com.seguranca.publica.registro_ocorrencia.repository;

import com.seguranca.publica.registro_ocorrencia.model.Agente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AgenteRepository extends JpaRepository<Agente, UUID> {
    List<Agente> findByNomeCompletoContainingIgnoreCase(String nome);
}
