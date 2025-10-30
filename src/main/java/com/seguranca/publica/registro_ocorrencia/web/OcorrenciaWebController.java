package com.seguranca.publica.registro_ocorrencia.web;

import com.seguranca.publica.registro_ocorrencia.model.Ocorrencia;
import com.seguranca.publica.registro_ocorrencia.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/web/ocorrencias")
public class OcorrenciaWebController {

    @Autowired
    private OcorrenciaService ocorrenciaService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("ocorrencias", ocorrenciaService.listarTodos());
        model.addAttribute("pageTitle", "Ocorrências - Sistema");
        model.addAttribute("activePage", "ocorrencias");
        return "ocorrencias/lista";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("ocorrencia", new Ocorrencia());
        model.addAttribute("pageTitle", "Nova Ocorrência - Sistema");
        model.addAttribute("activePage", "ocorrencias");
        return "ocorrencias/form";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Ocorrencia ocorrencia) {
        ocorrenciaService.criar(ocorrencia);
        return "redirect:/web/ocorrencias";
    }

    @GetMapping("/{id}")
    public String detalhe(@PathVariable UUID id, Model model) {
        var ocorrencia = ocorrenciaService.buscarPorId(id);
        model.addAttribute("ocorrencia", ocorrencia.orElse(new Ocorrencia()));
        model.addAttribute("pageTitle", "Detalhes da Ocorrência - Sistema");
        model.addAttribute("activePage", "ocorrencias");
        return "ocorrencias/detalhe";
    }
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable UUID id, Model model) {
        var ocorrencia = ocorrenciaService.buscarPorId(id);
        model.addAttribute("ocorrencia", ocorrencia.orElse(new Ocorrencia()));
        model.addAttribute("pageTitle", "Editar Ocorrência - Sistema");
        model.addAttribute("activePage", "ocorrencias");
        return "ocorrencias/form";
    }
    @DeleteMapping("/excluir/{id}")
    public String excluirOcorrencia(@PathVariable UUID id) {
        ocorrenciaService.excluir(id);
        return "redirect:/web/ocorrencias";
    }
}

