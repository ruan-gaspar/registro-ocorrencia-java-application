package com.seguranca.publica.registro_ocorrencia.controller;

import com.seguranca.publica.registro_ocorrencia.model.Ocorrencia;
import com.seguranca.publica.registro_ocorrencia.service.OcorrenciaService;
import io.swagger.v3.oas.annotations.Operation;             // Import para anotações OpenAPI
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/ocorrencias")
@Tag(name = "Ocorrencia", description = "Endpoints para gerenciamento de ocorrências")
public class OcorrenciaController {

    private final OcorrenciaService ocorrenciaService;

    public OcorrenciaController(OcorrenciaService ocorrenciaService) {
        this.ocorrenciaService = ocorrenciaService;
    }

    @GetMapping
    @Operation(summary = "Lista todas as ocorrências")
    public List<Ocorrencia> listar() {
        return ocorrenciaService.listarTodos();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Busca ocorrência por ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Ocorrência encontrada"),
            @ApiResponse(responseCode = "404", description = "Ocorrência não encontrada")
    })
    public ResponseEntity<Ocorrencia> buscarPorId(
            @Parameter(description = "ID da ocorrência") @PathVariable UUID id) {
        return ocorrenciaService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Cria uma nova ocorrência")
    @ApiResponse(responseCode = "200", description = "Ocorrência criada com sucesso",
            content = @Content(schema = @Schema(implementation = Ocorrencia.class)))
    public Ocorrencia criar(@io.swagger.v3.oas.annotations.parameters.RequestBody(
            description = "Dados da nova ocorrência",
            required = true,
            content = @Content(schema = @Schema(implementation = Ocorrencia.class))
    )
                            @RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.criar(ocorrencia);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualiza ocorrência pelo ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Ocorrência atualizada"),
            @ApiResponse(responseCode = "404", description = "Ocorrência não encontrada")
    })
    public ResponseEntity<Ocorrencia> atualizar(
            @Parameter(description = "ID da ocorrência") @PathVariable UUID id,
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Dados atualizados da ocorrência",
                    required = true,
                    content = @Content(schema = @Schema(implementation = Ocorrencia.class))
            )
            @RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.buscarPorId(id).map(existing -> {
                    ocorrencia.setId(id);
                    Ocorrencia updated = ocorrenciaService.atualizar(ocorrencia);
                    return ResponseEntity.ok(updated);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Exclui ocorrência pelo ID")
    @ApiResponses({
            @ApiResponse(responseCode = "204", description = "Ocorrência excluída com sucesso"),
            @ApiResponse(responseCode = "404", description = "Ocorrência não encontrada")
    })
    public ResponseEntity<Void> excluir(@Parameter(description = "ID da ocorrência") @PathVariable UUID id) {
        return ocorrenciaService.buscarPorId(id).map(existing -> {
                    ocorrenciaService.excluir(id);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
