package com.jahnavi.flashcard.service;


import com.jahnavi.flashcard.model.Deck;
import com.jahnavi.flashcard.repository.DeckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeckService {

    @Autowired
    private DeckRepository deckRepository;

    public List<Deck> getAllDecks() {
        return deckRepository.findAll();
    }

    public void addDeck(Deck deck) {
        deckRepository.save(deck);
    }
}
