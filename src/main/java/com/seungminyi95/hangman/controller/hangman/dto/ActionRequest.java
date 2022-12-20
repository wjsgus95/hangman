package com.seungminyi95.hangman.controller.hangman.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ActionRequest {
    private ActionType type;

    private StartAction startAction;
    private GuessAction guessAction;
}

