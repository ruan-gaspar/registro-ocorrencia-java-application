package com.seguranca.publica.registro_ocorrencia.controller;

import com.seguranca.publica.registro_ocorrencia.model.AgenteResponsavel;
import com.seguranca.publica.registro_ocorrencia.service.AgenteResponsavelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/agentes")

public class AgenteResponsavelController {
    private final AgenteResponsavelService agenteResponsavelService;

    public AgenteResponsavelController(AgenteResponsavelService agenteResponsavelService) {
        this.agenteResponsavelService = agenteResponsavelService;
    }

    @GetMapping
    public List<AgenteResponsavel> listar() {
        return agenteResponsavelService.listarAgentes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AgenteResponsavel> buscarPorId(@PathVariable UUID id) {
        return agenteResponsavelService.buscarAgentePorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public AgenteResponsavel cadastrar(@RequestBody AgenteResponsavel agenteResponsavel) {
        return agenteResponsavelService.cadastrarAgente(agenteResponsavel);
    }
    @PutMapping("/{id}")
    public ResponseEntity<AgenteResponsavel> atualizar(@PathVariable UUID id, @RequestBody AgenteResponsavel agenteResponsavel) {
        return agenteResponsavelService.buscarAgentePorId(id)
                .map(existing -> {
                    agenteResponsavel.setId(id);
                    AgenteResponsavel updated = agenteResponsavelService.atualizarAgentes(agenteResponsavel);
                    return ResponseEntity.ok(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
            public ResponseEntity<Void> excluir(@PathVariable UUID id) {
        return agenteResponsavelService.buscarAgentePorId(id)
                .map(existing -> {
                    agenteResponsavelService.excluirAgente(id);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}


