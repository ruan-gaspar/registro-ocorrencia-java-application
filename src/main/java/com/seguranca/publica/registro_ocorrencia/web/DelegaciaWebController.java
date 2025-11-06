package com.seguranca.publica.registro_ocorrencia.web;

import com.seguranca.publica.registro_ocorrencia.model.Delegacia;
import com.seguranca.publica.registro_ocorrencia.service.DelegaciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/web/delegacias")
public class DelegaciaWebController {

    @Autowired
    private DelegaciaService delegaciaService;

    @GetMapping
    public String listar(@RequestParam(required = false) String nome, Model model) {
        List<Delegacia> delegacias;

        if (nome != null && !nome.isBlank()) {
            delegacias = delegaciaService.buscarDelegaciaPorNome(nome);
        } else {
            delegacias = delegaciaService.listarTodasDelegacias();
        }

        model.addAttribute("delegacias", delegacias);
        model.addAttribute("pageTitle", "Delegacias - Sistema");
        model.addAttribute("activePage", "delegacias");
        model.addAttribute("nome", nome);
        return "delegacias/lista";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("delegacia", new Delegacia());
        model.addAttribute("pageTitle", "Nova Delegacia - Sistema");
        model.addAttribute("activePage", "delegacias");
        return "delegacias/form";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Delegacia delegacia) {
        delegaciaService.cadastrarDelegacia(delegacia);
        return "redirect:/web/delegacias";
    }

    @GetMapping("/{id}")
    public String detalhe(@PathVariable UUID id, Model model) {
        var delegacia = delegaciaService.buscarDelegaciaPorId(id);
        model.addAttribute("delegacia", delegacia.orElse(new Delegacia()));
        model.addAttribute("pageTitle", "Detalhes da Delegacia - Sistema");
        model.addAttribute("activePage", "delegacias");
        return "delegacias/detalhe";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable UUID id, Model model) {
        var delegacia = delegaciaService.buscarDelegaciaPorId(id);
        model.addAttribute("delegacia", delegacia.orElse(new Delegacia()));
        model.addAttribute("pageTitle", "Editar Delegacia - Sistema");
        model.addAttribute("activePage", "delegacias");
        return "delegacias/form";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable UUID id) {
        delegaciaService.excluirCadastroDelegacia(id);
        return "redirect:/web/delegacias";
    }
}
