package com.seguranca.publica.registro_ocorrencia.repository;

import com.seguranca.publica.registro_ocorrencia.model.Agente;
import com.seguranca.publica.registro_ocorrencia.model.Noticiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface NoticianteRepository extends JpaRepository<Noticiante, UUID> {

    List<Noticiante> findByNomeCompletoContainingIgnoreCase(String nome);
}
