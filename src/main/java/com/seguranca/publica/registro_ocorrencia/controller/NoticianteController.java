package com.seguranca.publica.registro_ocorrencia.controller;
import com.seguranca.publica.registro_ocorrencia.model.Noticiante;
import com.seguranca.publica.registro_ocorrencia.service.NoticianteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/noticiantes")

public class NoticianteController {
    private final NoticianteService noticianteService;

    public NoticianteController(NoticianteService noticianteService) {
        this.noticianteService = noticianteService;
    }

    @GetMapping
    public List<Noticiante> listarTodos() {
        return noticianteService.listarTodos();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Noticiante> buscarNoticiantePorId(@PathVariable UUID id) {
        return noticianteService.buscarNoticiantePorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Noticiante cadastrarNoticiante(@RequestBody Noticiante noticiante) {
        return noticianteService.cadastrarNoticiante(noticiante);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Noticiante> atualizarCadastroNoticiante(@PathVariable UUID id, @RequestBody Noticiante noticiante) {
        return noticianteService.buscarNoticiantePorId(id)
                .map(existing -> {
                    noticiante.setId(id);
                    Noticiante updated = noticianteService.atualizarCadastroNoticiante(noticiante);
                    return ResponseEntity.ok(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirCadastroDelegacia(@PathVariable UUID id) {
        return noticianteService.buscarNoticiantePorId(id)
                .map(existing -> {
                    noticianteService.excluirCadastroNoticiante(id);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}


