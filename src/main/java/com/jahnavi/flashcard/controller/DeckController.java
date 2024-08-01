package com.jahnavi.flashcard.controller;

import com.jahnavi.flashcard.model.Deck;
import com.jahnavi.flashcard.service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/decks")
public class DeckController {

    @Autowired
    private DeckService deckService;

    @GetMapping
    public String getAllDecks(Model model) {
        model.addAttribute("decks", deckService.getAllDecks());
        return "decks";
    }

    @GetMapping("/new")
    public String createDeckForm(Model model) {
        model.addAttribute("deck", new Deck());
        return "create_deck";
    }

    @PostMapping
    public String createDeck(@ModelAttribute Deck deck) {
        deckService.addDeck(deck);
        return "redirect:/decks";
    }
}
