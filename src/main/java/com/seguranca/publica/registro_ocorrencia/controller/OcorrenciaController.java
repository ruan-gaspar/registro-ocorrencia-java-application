package com.seguranca.publica.registro_ocorrencia.controller;

import com.seguranca.publica.registro_ocorrencia.model.Ocorrencia;
import com.seguranca.publica.registro_ocorrencia.service.OcorrenciaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/ocorrencias")
public class OcorrenciaController {

    private final OcorrenciaService ocorrenciaService;

    public OcorrenciaController(OcorrenciaService ocorrenciaService) {
        this.ocorrenciaService = ocorrenciaService;
    }

    @GetMapping
    public List<Ocorrencia> listar() {
        return ocorrenciaService.listarTodos();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Ocorrencia> buscarPorId(@PathVariable UUID id) {
        return ocorrenciaService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Ocorrencia criar(@RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.criar(ocorrencia);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Ocorrencia> atualizar(@PathVariable UUID id,@RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.buscarPorId(id).map(existing -> {
            ocorrencia.setId(id);
            Ocorrencia updated = ocorrenciaService.atualizar(ocorrencia);
            return ResponseEntity.ok(updated);
        })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable UUID id) {
        return ocorrenciaService.buscarPorId(id)
                .map(existing -> {
                    ocorrenciaService.excluir(id);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
    //Apenas Teste aleatório
    @GetMapping
    public String Ocorrencia() {
        return "Ocorrência registrada.";
    }
}
