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

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("agentes", agenteService.listarAgentes());
        model.addAttribute("pageTitle", "Agentes - Sistema");
        model.addAttribute("activePage", "agentes");
        return "agentes/lista";
    }


    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("agente", new AgenteResponsavel());
        return "agentes/form";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute AgenteResponsavel agente) {
        agenteService.cadastrarAgente(agente);
        return "redirect:/web/agentes";
    }

    @GetMapping("/{id}")
    public String detalhe(@PathVariable UUID id, Model model) {
        var agente = agenteService.buscarAgentePorId(id);
        model.addAttribute("agente", agente.orElse(new AgenteResponsavel()));
        return "agentes/detalhe";
    }
}
