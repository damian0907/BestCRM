package com.example.bestcrmintheuniverse.controllers;

import com.example.bestcrmintheuniverse.entities.Person;
import com.example.bestcrmintheuniverse.repositories.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequestMapping("/persons")
@Controller
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/")
    public String list(Model model) {
        List<Person> persons = (List<Person>) personRepository.findAll();
        model.addAttribute("persons", persons);
        return "persons/listPersons";
    }

    @GetMapping("/addPerson")
    public String add(Model model) {
        model.addAttribute("person", new Person());
        return "persons/addPerson";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Person person) {
        personRepository.save(person);
        return "redirect:/persons/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        personRepository.deleteById(id);
        return "redirect:/persons/";
    }
}