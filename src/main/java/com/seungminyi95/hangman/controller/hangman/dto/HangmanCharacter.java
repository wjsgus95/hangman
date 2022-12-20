package com.seungminyi95.hangman.controller.hangman.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class HangmanCharacter {
    private boolean hidden;
    private char value;

    public static final HangmanCharacter HIDDEN = new HangmanCharacter()
            .setHidden(true);
}
