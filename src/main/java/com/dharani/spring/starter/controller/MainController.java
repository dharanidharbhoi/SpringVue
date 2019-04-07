package com.dharani.spring.starter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
    @GetMapping("/index")
    public String index(Model model) {
       model.addAttribute("eventName", "FIFA 2018");
        return "index";
    }
}
