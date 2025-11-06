package com.seguranca.publica.registro_ocorrencia.web;

import com.seguranca.publica.registro_ocorrencia.model.Agente;
import com.seguranca.publica.registro_ocorrencia.service.AgenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/web/agentes")
public class AgenteWebController {

    @Autowired
    private AgenteService agenteService;

    @GetMapping
    public String listar(@RequestParam(required = false) String nome, Model model) {
        List<Agente> agentes;

        if (nome != null && !nome.isBlank()) {
            agentes = agenteService.buscarPorNome(nome);
        } else {
            agentes = agenteService.listarAgente();
        }

        model.addAttribute("agentes", agentes);
        model.addAttribute("pageTitle", "Agentes - Sistema");
        model.addAttribute("activePage", "agentes");
        model.addAttribute("nome", nome); // para manter texto do input na view

        return "agentes/lista";
    }


    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("agente", new Agente());
        model.addAttribute("pageTitle", "Novo Agente - Sistema");
        model.addAttribute("activePage", "agentes");
        return "agentes/form";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Agente agente) {
        agenteService.cadastrarAgente(agente); // service já salva ou atualiza
        return "redirect:/web/agentes";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable UUID id, Model model) {
        var agente = agenteService.buscarAgentePorId(id).orElse(new Agente());
        model.addAttribute("agente", agente);
        model.addAttribute("pageTitle", "Editar Agente - Sistema");
        model.addAttribute("activePage", "agentes");
        return "agentes/form";
    }

    @GetMapping("/{id}")
    public String detalhe(@PathVariable UUID id, Model model) {
        var agente = agenteService.buscarAgentePorId(id).orElse(new Agente());
        model.addAttribute("agente", agente);
        model.addAttribute("pageTitle", "Detalhes do Agente - Sistema");
        model.addAttribute("activePage", "agentes");
        return "agentes/detalhe";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable UUID id) {
        agenteService.excluirAgente(id);
        return "redirect:/web/agentes";
    }
}
