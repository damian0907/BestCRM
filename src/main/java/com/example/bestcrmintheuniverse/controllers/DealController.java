package com.example.bestcrmintheuniverse.controllers;

import com.example.bestcrmintheuniverse.entities.Deal;
import com.example.bestcrmintheuniverse.entities.Notes;
import com.example.bestcrmintheuniverse.entities.DealService;
import com.example.bestcrmintheuniverse.repositories.DealRepository;
import com.example.bestcrmintheuniverse.repositories.ClientRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/deals")
public class DealController {

    private final DealRepository dealRepository;
    private final ClientRepository clientRepository;
    private final DealService dealService;

    public DealController(DealRepository dealRepository, ClientRepository clientRepository, DealService dealService) {
        this.dealRepository = dealRepository;
        this.clientRepository = clientRepository;
        this.dealService = dealService;
    }

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("deals", this.dealRepository.findAll());
        return "deals/listDeals";
    }

    @GetMapping("/addDeal")
    public String add(Model model) {
        model.addAttribute("deal", new Deal());
        model.addAttribute("clients", clientRepository.findAll());
        return "deals/addDeal";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("deal") Deal deal, @RequestParam("clientId") Long clientId) {
        deal.setClient(clientRepository.findById(clientId).orElse(null));
        this.dealRepository.save(deal);
        return "redirect:/deals/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        System.out.print("delete deal with id");
        this.dealRepository.deleteById(id);
        return "redirect:/deals/";
    }
    @GetMapping("/notes/{id}")
    public String showNotesForm(@PathVariable("id") Long id, Model model) {
        // Fetch the deal with the given ID from the database
        Deal deal = dealService.getDealById(id);

        // Create a new Notes object
        Notes notes = new Notes();
        notes.setDeal(deal);

        // Add the Notes object to the model for rendering in the view
        model.addAttribute("notes", notes);
        model.addAttribute("deal", deal);

        return "deals/notesForm";
    }

}