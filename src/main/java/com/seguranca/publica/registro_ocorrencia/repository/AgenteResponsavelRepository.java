package com.seguranca.publica.registro_ocorrencia.repository;

import com.seguranca.publica.registro_ocorrencia.model.AgenteResponsavel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AgenteResponsavelRepository extends JpaRepository<AgenteResponsavel, UUID> {
}
