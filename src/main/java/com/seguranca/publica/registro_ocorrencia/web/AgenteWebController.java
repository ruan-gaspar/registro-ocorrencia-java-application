package com.seguranca.publica.registro_ocorrencia.web;

import com.seguranca.publica.registro_ocorrencia.model.AgenteResponsavel;
import com.seguranca.publica.registro_ocorrencia.service.AgenteResponsavelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/web/agentes")
public class AgenteWebController {

    @Autowired
    private AgenteResponsavelService agenteService;

    // Lista todos os agentes
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("agentes", agenteService.listarAgentes());
        model.addAttribute("pageTitle", "Agentes - Sistema");
        model.addAttribute("activePage", "agentes");
        return "agentes/lista";
    }

    // Exibe formulário para criar novo agente
    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("agente", new AgenteResponsavel());
        model.addAttribute("pageTitle", "Novo Agente - Sistema");
        model.addAttribute("activePage", "agentes");
        return "agentes/form";
    }

    // Salva ou atualiza agente
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute AgenteResponsavel agente) {
        agenteService.cadastrarAgente(agente); // service já salva ou atualiza
        return "redirect:/web/agentes";
    }

    // Edita agente existente
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable UUID id, Model model) {
        var agente = agenteService.buscarAgentePorId(id).orElse(new AgenteResponsavel());
        model.addAttribute("agente", agente);
        model.addAttribute("pageTitle", "Editar Agente - Sistema");
        model.addAttribute("activePage", "agentes");
        return "agentes/form";
    }

    // Detalhes do agente
    @GetMapping("/{id}")
    public String detalhe(@PathVariable UUID id, Model model) {
        var agente = agenteService.buscarAgentePorId(id).orElse(new AgenteResponsavel());
        model.addAttribute("agente", agente);
        model.addAttribute("pageTitle", "Detalhes do Agente - Sistema");
        model.addAttribute("activePage", "agentes");
        return "agentes/detalhe";
    }

    // Excluir agente
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable UUID id) {
        agenteService.excluirAgente(id);
        return "redirect:/web/agentes";
    }
}
