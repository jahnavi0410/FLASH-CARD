package com.jahnavi.flashcard.repository;

import com.jahnavi.flashcard.model.FlashCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlashCardRepository extends JpaRepository<FlashCard, Long> {
}
