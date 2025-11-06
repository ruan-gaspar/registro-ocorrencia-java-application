package com.seguranca.publica.registro_ocorrencia.controller;

import com.seguranca.publica.registro_ocorrencia.model.Agente;
import com.seguranca.publica.registro_ocorrencia.service.AgenteService;
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
public class AgenteController {
    private final AgenteService agenteService;

    public AgenteController(AgenteService agenteService) {
        this.agenteService = agenteService;
    }

    @GetMapping
    @Operation(summary = "Lista todos os agentes")
    public List<Agente> listar() {
        return agenteService.listarAgente();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Busca agente por ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Agente encontrado"),
            @ApiResponse(responseCode = "404", description = "Agente não encontrado")
    })
    public ResponseEntity<Agente> buscarPorId(
            @Parameter(description = "ID do agente") @PathVariable UUID id) {
        return agenteService.buscarAgentePorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Cadastra novo agente")
    @ApiResponse(responseCode = "200", description = "Agente cadastrado com sucesso")
    public Agente cadastrar(
            @Parameter(description = "Objeto agente a ser cadastrado") @RequestBody Agente agente) {
        return agenteService.cadastrarAgente(agente);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualiza agente existente pelo ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Agente atualizado com sucesso"),
            @ApiResponse(responseCode = "404", description = "Agente não encontrado para atualização")
    })
    public ResponseEntity<Agente> atualizar(
            @Parameter(description = "ID do agente a ser atualizado") @PathVariable UUID id,
            @Parameter(description = "Novo dados do agente") @RequestBody Agente agente) {
        return agenteService.buscarAgentePorId(id)
                .map(existing -> {
                    agente.setId(id);
                    Agente updated = agenteService.atualizarAgentes(agente);
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
        return agenteService.buscarAgentePorId(id)
                .map(existing -> {
                    agenteService.excluirAgente(id);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
