package com.seungminyi95.hangman.controller.hangman.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class ActionResponse {
    private int lifeCount;
    private List<HangmanCharacter> characters;
    private List<Character> triedValues;
}
