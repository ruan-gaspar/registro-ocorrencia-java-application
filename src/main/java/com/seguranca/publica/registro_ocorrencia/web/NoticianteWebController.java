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

    // LISTAR TODOS
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("noticiantes", noticianteService.listarTodos());
        model.addAttribute("pageTitle", "Noticiantes - Sistema");
        model.addAttribute("activePage", "noticiantes");
        return "noticiantes/lista";
    }

    // FORMULÁRIO NOVO
    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("noticiante", new Noticiante());
        model.addAttribute("pageTitle", "Novo Noticiante - Sistema");
        model.addAttribute("activePage", "noticiantes");
        return "noticiantes/form";
    }

    // SALVAR (NOVO OU EDITAR)
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Noticiante noticiante) {
        if (noticiante.getId() == null) {
            noticianteService.cadastrarNoticiante(noticiante);
        } else {
            noticianteService.atualizarCadastroNoticiante(noticiante);
        }
        return "redirect:/web/noticiantes";
    }

    // EDITAR
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable UUID id, Model model) {
        var noticianteOpt = noticianteService.buscarNoticiantePorId(id);
        if (noticianteOpt.isPresent()) {
            model.addAttribute("noticiante", noticianteOpt.get());
        } else {
            model.addAttribute("noticiante", new Noticiante());
        }
        model.addAttribute("pageTitle", "Editar Noticiante - Sistema");
        model.addAttribute("activePage", "noticiantes");
        return "noticiantes/form";
    }

    // DETALHE
    @GetMapping("/{id}")
    public String detalhe(@PathVariable UUID id, Model model) {
        var noticianteOpt = noticianteService.buscarNoticiantePorId(id);
        model.addAttribute("noticiante", noticianteOpt.orElse(new Noticiante()));
        model.addAttribute("pageTitle", "Detalhes do Noticiante - Sistema");
        model.addAttribute("activePage", "noticiantes");
        return "noticiantes/detalhe";
    }

    // EXCLUIR
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable UUID id) {
        noticianteService.excluirCadastroNoticiante(id);
        return "redirect:/web/noticiantes";
    }
}
