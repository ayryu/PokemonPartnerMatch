package com.ayryu.springprojects.pokemonmatcher;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomepageController {

    @GetMapping
    public String showPage(ModelMap model) {
        //homepageMessage is an attribute in "home-page.jsp"
        model.addAttribute("homepageMessage", "Welcome to the exciting world of Pokemon!");
        return "home-page";
    }

}
