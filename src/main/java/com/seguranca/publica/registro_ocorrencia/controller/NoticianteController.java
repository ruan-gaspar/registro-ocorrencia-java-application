package com.seguranca.publica.registro_ocorrencia.controller;

import com.seguranca.publica.registro_ocorrencia.model.Noticiante;
import com.seguranca.publica.registro_ocorrencia.service.NoticianteService;
import io.swagger.v3.oas.annotations.Operation;             // Modificações: imports OpenAPI
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/noticiantes")
@Tag(name = "Noticiante", description = "Endpoints para gerenciamento de noticiantes")  // Tag geral do controller
public class NoticianteController {
    private final NoticianteService noticianteService;

    public NoticianteController(NoticianteService noticianteService) {
        this.noticianteService = noticianteService;
    }

    @GetMapping
    @Operation(summary = "Lista todos os noticiantes")
    public List<Noticiante> listarTodos() {
        return noticianteService.listarTodos();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Busca noticiante por ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Noticiante encontrado"),
            @ApiResponse(responseCode = "404", description = "Noticiante não encontrado")
    })
    public ResponseEntity<Noticiante> buscarNoticiantePorId(
            @Parameter(description = "ID do noticiante") @PathVariable UUID id) {
        return noticianteService.buscarNoticiantePorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Cadastra novo noticiante")
    @ApiResponse(responseCode = "200", description = "Noticiante cadastrado com sucesso")
    public Noticiante cadastrarNoticiante(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Objeto noticiante a ser cadastrado",
                    required = true,
                    content = @Content(schema = @Schema(implementation = Noticiante.class))
            )
            @RequestBody Noticiante noticiante) {
        return noticianteService.cadastrarNoticiante(noticiante);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualiza noticiante existente pelo ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Noticiante atualizado com sucesso"),
            @ApiResponse(responseCode = "404", description = "Noticiante não encontrado para atualização")
    })
    public ResponseEntity<Noticiante> atualizarCadastroNoticiante(
            @Parameter(description = "ID do noticiante a ser atualizado") @PathVariable UUID id,
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Novos dados do noticiante",
                    required = true,
                    content = @Content(schema = @Schema(implementation = Noticiante.class))
            )
            @RequestBody Noticiante noticiante) {
        return noticianteService.buscarNoticiantePorId(id)
                .map(existing -> {
                    noticiante.setId(id);
                    Noticiante updated = noticianteService.atualizarCadastroNoticiante(noticiante);
                    return ResponseEntity.ok(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remove noticiante pelo ID")
    @ApiResponses({
            @ApiResponse(responseCode = "204", description = "Noticiante removido com sucesso"),
            @ApiResponse(responseCode = "404", description = "Noticiante não encontrado para exclusão")
    })
    public ResponseEntity<Void> excluirCadastroDelegacia(
            @Parameter(description = "ID do noticiante a ser excluído") @PathVariable UUID id) {
        return noticianteService.buscarNoticiantePorId(id)
                .map(existing -> {
                    noticianteService.excluirCadastroNoticiante(id);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
