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
        return "lista";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("ocorrencia", new Ocorrencia());
        return "form";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Ocorrencia ocorrencia) {
        ocorrenciaService.criar(ocorrencia);
        return "redirect:/web/ocorrencias/ocorrencias";
    }

    @GetMapping("/{id}")
    public String detalhe(@PathVariable UUID id, Model model) {
        var ocorrencia = ocorrenciaService.buscarPorId(id);
        model.addAttribute("ocorrencia", ocorrencia.orElse(null));
        return "detalhe";
    }
}
