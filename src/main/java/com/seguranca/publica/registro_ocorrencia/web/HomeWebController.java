package com.seguranca.publica.registro_ocorrencia.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeWebController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("pageTitle", "Home - Sistema");
        model.addAttribute("activePage", "home");
        return "index";
    }
}
