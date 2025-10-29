package com.seguranca.publica.registro_ocorrencia.web;

import com.seguranca.publica.registro_ocorrencia.model.Noticiante;
import com.seguranca.publica.registro_ocorrencia.service.NoticianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/web/noticiantes")
public class NoticianteWebController {

    @Autowired
    private NoticianteService noticianteService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("noticiantes", noticianteService.listarTodos());
        return "lista";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("noticiante", new Noticiante());
        return "form";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Noticiante noticiante) {
        noticianteService.cadastrarNoticiante(noticiante);
        return "redirect:/web/noticiantes/noticiantes";
    }

    @GetMapping("/{id}")
    public String detalhe(@PathVariable UUID id, Model model) {
        var noticiante = noticianteService.buscarNoticiantePorId(id);
        model.addAttribute("noticiante", noticiante.orElse(null));
        return "detalhe";
    }
}
