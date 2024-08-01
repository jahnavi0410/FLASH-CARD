package com.jahnavi.flashcard.repository;



import com.jahnavi.flashcard.model.Deck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeckRepository extends JpaRepository<Deck, Long> {
}
