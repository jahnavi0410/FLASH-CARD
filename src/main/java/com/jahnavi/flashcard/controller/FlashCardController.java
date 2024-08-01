package com.jahnavi.flashcard.controller;



import com.jahnavi.flashcard.model.FlashCard;
import com.jahnavi.flashcard.service.DeckService;
import com.jahnavi.flashcard.service.FlashCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/flashcards")
public class FlashCardController {

    @Autowired
    private FlashCardService flashcardService;

    @Autowired
    private DeckService deckService;

    @GetMapping
    public String getAllFlashcards(Model model) {
        model.addAttribute("flashcards", flashcardService.getAllFlashcards());
        return "flashcards";
    }

    @GetMapping("/new")
    public String createFlashcardForm(Model model) {
        model.addAttribute("flashcard", new FlashCard());
        model.addAttribute("decks", deckService.getAllDecks());
        return "create_flashcard";
    }

    @PostMapping
    public String createFlashcard(@ModelAttribute FlashCard flashcard) {
        flashcardService.addFlashcard(flashcard);
        return "redirect:/flashcards";
    }
}
