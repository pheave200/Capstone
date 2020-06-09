package com.hfo.Capstone.controllers;

import com.hfo.Capstone.models.Recipe;
import com.hfo.Capstone.models.data.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("recipes")
public class RecipeController {

    @Autowired
    public RecipeRepository recipeRepository;

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("title", "Recipes");
        model.addAttribute("recipes",recipeRepository.findAll());
        return "recipes/index";
    }

    @GetMapping("add")
    public String displayAddRecipeForm(Model model) {
        model.addAttribute(new Recipe());
        return "recipes/add";
    }

    @PostMapping("add")
    public String processAddRecipeForm(@ModelAttribute @Valid Recipe newRecipe, Errors errors,Model model) {
        if (errors.hasErrors()) {
            return "recipes/add";
        }
        recipeRepository.save(newRecipe);
        return "redirect:";
    }
    @GetMapping("delete")
    public String displayDeleteRecipeForm(Model model) {
        model.addAttribute("title", "Delete Recipe");
        model.addAttribute("recipes", recipeRepository.findAll());
        return "recipes/delete";
    }

    @PostMapping("delete")
    public String processDeleteRecipeFOrm(@RequestParam(required = false) int [] recipeIds) {
        if (recipeIds!=null) {
            for (int id:recipeIds) {
                recipeRepository.deleteById(id);
            }
        }
        return "redirect:";
    }
}
