package com.seguranca.publica.registro_ocorrencia.repository;

import com.seguranca.publica.registro_ocorrencia.model.Noticiante;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface NoticianteRepository extends CrudRepository<Noticiante, UUID> {
}
