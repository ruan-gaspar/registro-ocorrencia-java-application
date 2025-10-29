package com.seguranca.publica.registro_ocorrencia.web;

import com.seguranca.publica.registro_ocorrencia.model.Delegacia;
import com.seguranca.publica.registro_ocorrencia.service.DelegaciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/web/delegacias")
public class DelegaciaWebController {

    @Autowired
    private DelegaciaService delegaciaService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("delegacias", delegaciaService.listarTodasDelegacias());
        return "lista";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("delegacia", new Delegacia());
        return "form";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Delegacia delegacia) {
        delegaciaService.cadastrarDelegacia(delegacia);
        return "redirect:/web/delegacias/delegacias";
    }

    @GetMapping("/{id}")
    public String detalhe(@PathVariable UUID id, Model model) {
        var delegacia = delegaciaService.buscarDelegaciaPorId(id);
        model.addAttribute("delegacia", delegacia.orElse(null));
        return "detalhe";
    }
}
