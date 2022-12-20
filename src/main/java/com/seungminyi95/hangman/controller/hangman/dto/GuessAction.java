package com.seungminyi95.hangman.controller.hangman.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GuessAction {
    private char value;
    // TODO private String userId;
}
