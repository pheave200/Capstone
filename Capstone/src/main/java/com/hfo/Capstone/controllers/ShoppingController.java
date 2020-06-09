package com.hfo.Capstone.controllers;

import com.hfo.Capstone.models.Item;
import com.hfo.Capstone.models.data.ShoppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("shopping")
public class ShoppingController {

    @Autowired
    ShoppingRepository shoppingRepository;

    @RequestMapping("")
    public String index(Model model) {

        model.addAttribute("title", "Shopping List");
        model.addAttribute("items", shoppingRepository.findAll());
        return "shopping/index";
    }

    @GetMapping("add")
    public String displayAddItemForm(Model model) {
        model.addAttribute(new Item());
        return "shopping/add";
    }

    @PostMapping("add")
    public String processAddItemForm(@ModelAttribute @Valid Item newItem, Errors errors, Model model) {

        if (errors.hasErrors()) {
            return "shopping/add";
        }

        shoppingRepository.save(newItem);
        return "redirect:";
    }

    @GetMapping("delete")
    public String displayDeleteItemForm(Model model) {
        model.addAttribute("title", "Delete Item");
        model.addAttribute("items", shoppingRepository.findAll());
        return "shopping/delete";
    }

    @PostMapping("delete")
    public String processDeleteItemForm(@RequestParam(required = false) int[] itemIds) {
        if (itemIds!=null) {
            for (int id:itemIds) {
                shoppingRepository.deleteById(id);
            }
        }
        return "redirect:";
    }
}
