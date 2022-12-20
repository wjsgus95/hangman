package com.seungminyi95.hangman.service;

import com.seungminyi95.hangman.controller.hangman.dto.ActionResponse;
import com.seungminyi95.hangman.controller.hangman.dto.HangmanCharacter;
import com.seungminyi95.hangman.controller.hangman.dto.StartAction;
import com.seungminyi95.hangman.repository.HangmanRepository;
import com.seungminyi95.hangman.repository.HangmanSnapshot;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class HangmanStartService {
    private final HangmanRepository hangmanRepository;

    private static final List<String> MONTHS = Arrays.asList(
            "january",
            "february",
            "march",
            "april",
            "may",
            "june",
            "july",
            "august",
            "september",
            "october",
            "november",
            "december"
    );

    public ActionResponse startGame(StartAction action) {
        // Create new snapshot.
        int randomIndex = new Random().nextInt(12);
        String answer = MONTHS.get(randomIndex);

        HangmanSnapshot snapshot = new HangmanSnapshot()
                .setLifeCount(5)
                .setAnswer(answer)
                .setTriedValues(new HashSet<>());
        hangmanRepository.setSnapshot(""/* TODO action.getUserId() */, snapshot);

        return new ActionResponse()
                .setCharacters(convertCharacters(snapshot.getAnswer(), snapshot.getTriedValues()))
                .setLifeCount(snapshot.getLifeCount())
                .setTriedValues(new ArrayList<>(snapshot.getTriedValues()));
    }

    private List<HangmanCharacter> convertCharacters(String answer, Set<Character> triedValues) {
        List<HangmanCharacter> characters = new ArrayList<>();

        for (int i = 0; i < answer.length(); i++) {
            char character = answer.charAt(i);
            if (triedValues.contains(character)) {
                characters.add(new HangmanCharacter()
                        .setHidden(false)
                        .setValue(character)
                );
            } else {
                characters.add(HangmanCharacter.HIDDEN);
            }
        }

        return characters;
    }
}
