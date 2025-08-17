package com.eafit.tutorial05.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "First Steps in Spring Boot");
        model.addAttribute("subtitle", "An Spring Boot Application");
        return "home/index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Us - Online Store");
        model.addAttribute("subtitle", "About Us");
        model.addAttribute("description", "This is an about page for the Online Store.");
        model.addAttribute("author", "Diego Gonzalez");
        return "home/about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("email", "diego@gmail.com");
        model.addAttribute("address", "Universidad EAFIT");
        model.addAttribute("phone_number", "3201234567");
        return "home/contact";
    }
}