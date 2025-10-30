package com.seguranca.publica.registro_ocorrencia.controller;

import com.seguranca.publica.registro_ocorrencia.model.Delegacia;
import com.seguranca.publica.registro_ocorrencia.service.DelegaciaService;
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
@RequestMapping("/api/delegacias")
@Tag(name = "Delegacia", description = "Endpoints para gerenciamento de delegacias")  // Tag geral do controller
public class DelegaciaController {
    private final DelegaciaService delegaciaService;

    public DelegaciaController(DelegaciaService delegaciaService) {
        this.delegaciaService = delegaciaService;
    }

    @GetMapping
    @Operation(summary = "Lista todas as delegacias")
    public List<Delegacia> listar() {
        return delegaciaService.listarTodasDelegacias();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Busca delegacia por ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Delegacia encontrada"),
            @ApiResponse(responseCode = "404", description = "Delegacia não encontrada")
    })
    public ResponseEntity<Delegacia> buscarPorId(
            @Parameter(description = "ID da delegacia") @PathVariable UUID id) {
        return delegaciaService.buscarDelegaciaPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Cadastra nova delegacia")
    @ApiResponse(responseCode = "200", description = "Delegacia cadastrada com sucesso")
    public Delegacia cadastrarDelegacia(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Objeto delegacia a ser cadastrado",
                    required = true,
                    content = @Content(schema = @Schema(implementation = Delegacia.class))
            )
            @RequestBody Delegacia delegacia) {
        return delegaciaService.cadastrarDelegacia(delegacia);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualiza delegacia existente pelo ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Delegacia atualizada com sucesso"),
            @ApiResponse(responseCode = "404", description = "Delegacia não encontrada para atualização")
    })
    public ResponseEntity<Delegacia> atualizarCadastroDelegacia(
            @Parameter(description = "ID da delegacia a ser atualizada") @PathVariable UUID id,
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Novos dados da delegacia",
                    required = true,
                    content = @Content(schema = @Schema(implementation = Delegacia.class))
            )
            @RequestBody Delegacia delegacia) {
        return delegaciaService.buscarDelegaciaPorId(id)
                .map(existing -> {
                    delegacia.setId(id);
                    Delegacia updated = delegaciaService.atualizarCadastroDelegacia(delegacia);
                    return ResponseEntity.ok(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remove delegacia pelo ID")
    @ApiResponses({
            @ApiResponse(responseCode = "204", description = "Delegacia removida com sucesso"),
            @ApiResponse(responseCode = "404", description = "Delegacia não encontrada para exclusão")
    })
    public ResponseEntity<Void> excluirCadastroDelegacia(
            @Parameter(description = "ID da delegacia a ser excluída") @PathVariable UUID id) {
        return delegaciaService.buscarDelegaciaPorId(id)
                .map(existing -> {
                    delegaciaService.excluirCadastroDelegacia(id);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
