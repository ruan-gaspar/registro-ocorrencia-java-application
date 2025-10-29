package com.seguranca.publica.registro_ocorrencia.web;

import com.seguranca.publica.registro_ocorrencia.model.Terceiros;
import com.seguranca.publica.registro_ocorrencia.service.TerceirosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/web/terceiros")
public class TerceirosWebController {

    @Autowired
    private TerceirosService terceirosService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("terceiros", terceirosService.listarTodos());
        return "lista";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("terceiros", new Terceiros());
        return "form";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Terceiros terceiros) {
        terceirosService.cadastrarTerceiro(terceiros);
        return "redirect:/web/terceiros/terceiros";
    }

    @GetMapping("/{id}")
    public String detalhe(@PathVariable UUID id, Model model) {
        var terceiros = terceirosService.buscarTerceirosPorId(id);
        model.addAttribute("terceiros", terceiros.orElse(null));
        return "detalhe";
    }
}
