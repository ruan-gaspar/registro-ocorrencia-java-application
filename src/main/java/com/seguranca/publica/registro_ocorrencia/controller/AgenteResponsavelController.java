package com.seguranca.publica.registro_ocorrencia.controller;

import com.seguranca.publica.registro_ocorrencia.model.AgenteResponsavel;
import com.seguranca.publica.registro_ocorrencia.service.AgenteResponsavelService;
import io.swagger.v3.oas.annotations.Operation;            // Modificação: imports para anotações
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/agentes")
@Tag(name = "Agente Responsavel", description = "Endpoints para gerenciamento de agentes responsáveis")  // Tag geral do controller
public class AgenteResponsavelController {
    private final AgenteResponsavelService agenteResponsavelService;

    public AgenteResponsavelController(AgenteResponsavelService agenteResponsavelService) {
        this.agenteResponsavelService = agenteResponsavelService;
    }

    @GetMapping
    @Operation(summary = "Lista todos os agentes")
    public List<AgenteResponsavel> listar() {
        return agenteResponsavelService.listarAgentes();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Busca agente por ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Agente encontrado"),
            @ApiResponse(responseCode = "404", description = "Agente não encontrado")
    })
    public ResponseEntity<AgenteResponsavel> buscarPorId(
            @Parameter(description = "ID do agente") @PathVariable UUID id) {
        return agenteResponsavelService.buscarAgentePorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Cadastra novo agente")
    @ApiResponse(responseCode = "200", description = "Agente cadastrado com sucesso")
    public AgenteResponsavel cadastrar(
            @Parameter(description = "Objeto agente a ser cadastrado") @RequestBody AgenteResponsavel agenteResponsavel) {
        return agenteResponsavelService.cadastrarAgente(agenteResponsavel);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualiza agente existente pelo ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Agente atualizado com sucesso"),
            @ApiResponse(responseCode = "404", description = "Agente não encontrado para atualização")
    })
    public ResponseEntity<AgenteResponsavel> atualizar(
            @Parameter(description = "ID do agente a ser atualizado") @PathVariable UUID id,
            @Parameter(description = "Novo dados do agente") @RequestBody AgenteResponsavel agenteResponsavel) {
        return agenteResponsavelService.buscarAgentePorId(id)
                .map(existing -> {
                    agenteResponsavel.setId(id);
                    AgenteResponsavel updated = agenteResponsavelService.atualizarAgentes(agenteResponsavel);
                    return ResponseEntity.ok(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remove agente pelo ID")
    @ApiResponses({
            @ApiResponse(responseCode = "204", description = "Agente removido com sucesso"),
            @ApiResponse(responseCode = "404", description = "Agente não encontrado para exclusão")
    })
    public ResponseEntity<Void> excluir(
            @Parameter(description = "ID do agente a ser excluído") @PathVariable UUID id) {
        return agenteResponsavelService.buscarAgentePorId(id)
                .map(existing -> {
                    agenteResponsavelService.excluirAgente(id);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
