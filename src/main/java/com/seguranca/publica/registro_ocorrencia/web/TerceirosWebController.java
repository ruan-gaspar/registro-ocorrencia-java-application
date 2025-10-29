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

    // LISTAR TODOS
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("terceiros", terceirosService.listarTodos());
        model.addAttribute("pageTitle", "Terceiros - Sistema");
        model.addAttribute("activePage", "terceiros");
        return "terceiros/lista";
    }

    // FORMULÁRIO NOVO
    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("terceiro", new Terceiros());
        model.addAttribute("pageTitle", "Novo Terceiro - Sistema");
        model.addAttribute("activePage", "terceiros");
        return "terceiros/form";
    }

    // SALVAR (NOVO OU EDITAR)
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Terceiros terceiro) {
        if (terceiro.getId() == null) {
            terceirosService.cadastrarTerceiro(terceiro);
        } else {
            terceirosService.atualizarTerceiros(terceiro);
        }
        return "redirect:/web/terceiros";
    }

    // EDITAR
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable UUID id, Model model) {
        var terceiroOpt = terceirosService.buscarTerceirosPorId(id);
        model.addAttribute("terceiro", terceiroOpt.orElse(new Terceiros()));
        model.addAttribute("pageTitle", "Editar Terceiro - Sistema");
        model.addAttribute("activePage", "terceiros");
        return "terceiros/form";
    }

    // DETALHE
    @GetMapping("/{id}")
    public String detalhe(@PathVariable UUID id, Model model) {
        var terceiroOpt = terceirosService.buscarTerceirosPorId(id);
        model.addAttribute("terceiro", terceiroOpt.orElse(new Terceiros()));
        model.addAttribute("pageTitle", "Detalhes do Terceiro - Sistema");
        model.addAttribute("activePage", "terceiros");
        return "terceiros/detalhe";
    }

    // EXCLUIR
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable UUID id) {
        terceirosService.excluirCadastroTerceiros(id);
        return "redirect:/web/terceiros";
    }
}
