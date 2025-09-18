package com.seguranca.publica.registro_ocorrencia.controller;

import com.seguranca.publica.registro_ocorrencia.model.AgenteResponsavel;
import com.seguranca.publica.registro_ocorrencia.model.Delegacia;
import com.seguranca.publica.registro_ocorrencia.service.AgenteResponsavelService;
import com.seguranca.publica.registro_ocorrencia.service.DelegaciaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/delegacias")

public class DelegaciaController {
    private final DelegaciaService delegaciaService;

    public DelegaciaController(DelegaciaService delegaciaService) {
        this.delegaciaService = delegaciaService;
    }

    @GetMapping
    public List<Delegacia> listar() {
        return delegaciaService.listarTodasDelegacias();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Delegacia> buscarPorId(@PathVariable UUID id) {
        return delegaciaService.buscarDelegaciaPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Delegacia cadastrarDelegacia(@RequestBody Delegacia delegacia) {
        return delegaciaService.cadastrarDelegacia(delegacia);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Delegacia> atualizarCadastroDelegacia(@PathVariable UUID id, @RequestBody Delegacia delegacia) {
        return delegaciaService.buscarDelegaciaPorId(id)
                .map(existing -> {
                    delegacia.setId(id);
                    Delegacia updated = delegaciaService.atualizarCadastroDelegacia(delegacia);
                    return ResponseEntity.ok(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirCadastroDelegacia(@PathVariable UUID id) {
        return delegaciaService.buscarDelegaciaPorId(id)
                .map(existing -> {
                    delegaciaService.excluirCadastroDelegacia(id);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}


