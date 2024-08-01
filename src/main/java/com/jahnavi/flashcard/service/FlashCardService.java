package com.jahnavi.flashcard.service;

import com.jahnavi.flashcard.model.FlashCard;
import com.jahnavi.flashcard.repository.FlashCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlashCardService {

    @Autowired
    private FlashCardRepository flashcardRepository;

    public List<FlashCard> getAllFlashcards() {
        return flashcardRepository.findAll();
    }

    public void addFlashcard(FlashCard flashcard) {
        flashcardRepository.save(flashcard);
    }
}