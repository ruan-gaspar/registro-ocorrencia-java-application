package com.seguranca.publica.registro_ocorrencia.web;

import com.seguranca.publica.registro_ocorrencia.service.OcorrenciaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeWebController {

    private final OcorrenciaService ocorrenciaService;

    public HomeWebController(OcorrenciaService ocorrenciaService) {
        this.ocorrenciaService = ocorrenciaService;
    }

    @GetMapping("/")
    public String index(Model model) {
        long totalOcorrencias = ocorrenciaService.contarTodas();
        long totalResolvidas = ocorrenciaService.contarPorStatus(true);
        long totalAbertas = ocorrenciaService.contarPorStatus(false);

        model.addAttribute("totalOcorrencias", totalOcorrencias);
        model.addAttribute("totalResolvidas", totalResolvidas);
        model.addAttribute("totalAbertas", totalAbertas);

        model.addAttribute("pageTitle", "Home - Sistema");
        model.addAttribute("activePage", "home");
        return "index";
    }

}
