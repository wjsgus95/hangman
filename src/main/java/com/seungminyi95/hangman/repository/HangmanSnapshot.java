package com.seungminyi95.hangman.repository;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Set;

@Data
@Accessors(chain = true)
// Hangman Snapshot Information DAO
public class HangmanSnapshot {
    private int lifeCount;
    private Set<Character> triedValues;

    private String answer;
}
