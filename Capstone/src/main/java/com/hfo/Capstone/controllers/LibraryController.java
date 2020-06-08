package com.hfo.Capstone.controllers;

import com.hfo.Capstone.models.Book;
import com.hfo.Capstone.models.AbstractEntity;
import com.hfo.Capstone.models.data.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("library")
public class LibraryController extends AbstractEntity {

    @Autowired
    LibraryRepository libraryRepository;

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("title", "Home Library");
        model.addAttribute("books", libraryRepository.findAll());
        return "library/index";
    }

    @GetMapping("add")
    public String displayAddBookForm(Model model) {
        model.addAttribute(new Book());
        return "library/add";
    }

    @PostMapping("add")
    public String processAddBookForm(@ModelAttribute @Valid Book newBook, Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "library/add";
        }
        libraryRepository.save(newBook);
        return "redirect:";
    }
}
