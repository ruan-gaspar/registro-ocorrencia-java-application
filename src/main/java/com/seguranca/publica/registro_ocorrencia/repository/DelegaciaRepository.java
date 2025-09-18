package com.seguranca.publica.registro_ocorrencia.repository;

import com.seguranca.publica.registro_ocorrencia.model.Delegacia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DelegaciaRepository extends JpaRepository<Delegacia, UUID> {
}
