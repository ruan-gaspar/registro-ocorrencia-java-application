package com.seguranca.publica.registro_ocorrencia.web;

import com.seguranca.publica.registro_ocorrencia.model.Terceiros;
import com.seguranca.publica.registro_ocorrencia.service.TerceirosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/web/terceiros")
public class TerceirosWebController {

    @Autowired
    private TerceirosService terceirosService;

    @GetMapping
    public String listar(@RequestParam(required = false) String nome, Model model) {
        List<Terceiros> terceiros;

        if (nome != null && !nome.isBlank()) {
            terceiros = terceirosService.buscarPorNome(nome);
        } else {
            terceiros = terceirosService.listarTodos();
        }

        model.addAttribute("terceiros", terceiros);
        model.addAttribute("pageTitle", "Terceiros - Sistema");
        model.addAttribute("activePage", "terceiros");
        model.addAttribute("nome", nome);
        return "terceiros/lista";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("terceiro", new Terceiros());
        model.addAttribute("pageTitle", "Novo Terceiro - Sistema");
        model.addAttribute("activePage", "terceiros");
        return "terceiros/form";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Terceiros terceiro) {
        if (terceiro.getId() == null) {
            terceirosService.cadastrarTerceiro(terceiro);
        } else {
            terceirosService.atualizarTerceiros(terceiro);
        }
        return "redirect:/web/terceiros";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable UUID id, Model model) {
        var terceiroOpt = terceirosService.buscarTerceirosPorId(id);
        model.addAttribute("terceiro", terceiroOpt.orElse(new Terceiros()));
        model.addAttribute("pageTitle", "Editar Terceiro - Sistema");
        model.addAttribute("activePage", "terceiros");
        return "terceiros/form";
    }

    @GetMapping("/{id}")
    public String detalhe(@PathVariable UUID id, Model model) {
        var terceiroOpt = terceirosService.buscarTerceirosPorId(id);
        model.addAttribute("terceiro", terceiroOpt.orElse(new Terceiros()));
        model.addAttribute("pageTitle", "Detalhes do Terceiro - Sistema");
        model.addAttribute("activePage", "terceiros");
        return "terceiros/detalhe";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable UUID id) {
        terceirosService.excluirCadastroTerceiros(id);
        return "redirect:/web/terceiros";
    }
}
