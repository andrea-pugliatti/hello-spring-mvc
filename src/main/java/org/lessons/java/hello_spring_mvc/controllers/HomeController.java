package org.lessons.java.hello_spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String getHome() {
        return "index";
    }

    @GetMapping("/about")
    public String getAboutUs(@RequestParam(name = "name") String name,
            @RequestParam String lastname, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("lastname", lastname);
        return "about";
    }

    @GetMapping("/products/{id}")
    public String getProduct(@PathVariable("id") String productId, Model model) {
        model.addAttribute("id", productId);
        return "product";
    }

}
