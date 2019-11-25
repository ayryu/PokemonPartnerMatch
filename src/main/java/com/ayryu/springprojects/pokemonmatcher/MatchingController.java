package com.ayryu.springprojects.pokemonmatcher;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/match")
public class MatchingController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/showMatchingForm")
    public String showMatchingForm(Model model) {
        model.addAttribute("trainer", new Trainer());
        model.addAttribute("pokemon", new GeneratedMon());
        return "matching-form";
    }

    @RequestMapping("/processMatchingForm")
    public String processMatchingForm(
            @ModelAttribute("pokemon") GeneratedMon pokemon,
            @Valid @ModelAttribute("trainer") Trainer trainer,
            BindingResult theBindingResult) {
        //logging message to check for whitespace
        System.out.println("Name: |" + trainer.getFirstName() + "|");
        if(theBindingResult.hasErrors()) {
            return "matching-form";
        } else {
            return "matching-confirmation";
        }
    }
}
