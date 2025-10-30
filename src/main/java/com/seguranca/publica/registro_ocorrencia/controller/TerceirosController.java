package com.seguranca.publica.registro_ocorrencia.controller;

import com.seguranca.publica.registro_ocorrencia.model.Terceiros;
import com.seguranca.publica.registro_ocorrencia.service.TerceirosService;
import io.swagger.v3.oas.annotations.Operation;
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
@RequestMapping("/api/terceiros")
@Tag(name = "Terceiros", description = "Endpoints para gerenciamento de terceiros")
public class TerceirosController {
    private final TerceirosService terceirosService;

    public TerceirosController(TerceirosService terceirosService) {
        this.terceirosService = terceirosService;
    }

    @GetMapping
    @Operation(summary = "Lista todos os terceiros")
    public List<Terceiros> listarTodos() {
        return terceirosService.listarTodos();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Busca terceiro por ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Terceiro encontrado"),
            @ApiResponse(responseCode = "404", description = "Terceiro não encontrado")
    })
    public ResponseEntity<Terceiros> buscarPorId(
            @Parameter(description = "ID do terceiro") @PathVariable UUID id) {
        return terceirosService.buscarTerceirosPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Cadastra novo terceiro")
    @ApiResponse(responseCode = "200", description = "Terceiro cadastrado com sucesso")
    public Terceiros cadastrarTerceiros(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Objeto terceiro a ser cadastrado",
                    required = true,
                    content = @Content(schema = @Schema(implementation = Terceiros.class))
            )
            @RequestBody Terceiros terceiros) {
        return terceirosService.cadastrarTerceiro(terceiros);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualiza terceiro existente pelo ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Terceiro atualizado com sucesso"),
            @ApiResponse(responseCode = "404", description = "Terceiro não encontrado para atualização")
    })
    public ResponseEntity<Terceiros> atualizarTerceiros(
            @Parameter(description = "ID do terceiro a ser atualizado") @PathVariable UUID id,
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Novos dados do terceiro",
                    required = true,
                    content = @Content(schema = @Schema(implementation = Terceiros.class))
            )
            @RequestBody Terceiros terceiros) {
        return terceirosService.buscarTerceirosPorId(id)
                .map(existing -> {
                    terceiros.setId(id);
                    Terceiros updated = terceirosService.atualizarTerceiros(terceiros);
                    return ResponseEntity.ok(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remove terceiro pelo ID")
    @ApiResponses({
            @ApiResponse(responseCode = "204", description = "Terceiro removido com sucesso"),
            @ApiResponse(responseCode = "404", description = "Terceiro não encontrado para exclusão")
    })
    public ResponseEntity<Void> excluirCadastroTerceiros(
            @Parameter(description = "ID do terceiro a ser excluído") @PathVariable UUID id) {
        return terceirosService.buscarTerceirosPorId(id)
                .map(existing -> {
                    terceirosService.excluirCadastroTerceiros(id);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
