package com.seguranca.publica.registro_ocorrencia.controller;

import com.seguranca.publica.registro_ocorrencia.model.Terceiros;
import com.seguranca.publica.registro_ocorrencia.service.TerceirosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/terceiros")

public class TerceirosController {
    private final TerceirosService terceirosService;

    public TerceirosController(TerceirosService terceirosService) {
        this.terceirosService = terceirosService;
    }



    @GetMapping("/{id}")
    public ResponseEntity<Terceiros> buscarPorId(@PathVariable UUID id) {
        return terceirosService.buscarTerceirosPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Terceiros cadastrarTerceiros(@RequestBody Terceiros terceiros) {
        return terceirosService.cadastrarTerceiro(terceiros);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Terceiros> atualizarTerceiros(@PathVariable UUID id, @RequestBody Terceiros terceiros) {
        return terceirosService.buscarTerceirosPorId(id)
                .map(existing -> {
                    terceiros.setId(id);
                    Terceiros updated = terceirosService.atualizarTerceiros(terceiros);
                    return ResponseEntity.ok(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirCadastroTerceiros(@PathVariable UUID id) {
        return terceirosService.buscarTerceirosPorId(id)
                .map(existing -> {
                    terceirosService.excluirCadsatroTerceiros(id);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}


