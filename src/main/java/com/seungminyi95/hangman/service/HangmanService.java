package com.seungminyi95.hangman.service;

import com.seungminyi95.hangman.controller.hangman.dto.ActionRequest;
import com.seungminyi95.hangman.controller.hangman.dto.ActionResponse;
import com.seungminyi95.hangman.controller.hangman.dto.GuessAction;
import com.seungminyi95.hangman.controller.hangman.dto.StartAction;
import com.seungminyi95.hangman.repository.HangmanRepository;
import com.seungminyi95.hangman.repository.HangmanSnapshot;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class HangmanService {
    private final HangmanStartService hangmanStartService;
    // TODO private final HangmanGuessService hangmanGuessService;

    public ActionResponse action(ActionRequest request) {
        switch (request.getType()) {
            case START:
                return hangmanStartService.startGame(request.getStartAction());
            case GUESS:
                // TODO hangmanGuessService.guess(request.getGuessAction());
                return guess(request.getGuessAction());
            default:
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

    // TODO: move to new class HangmanGuessService
    private ActionResponse guess(GuessAction guessAction) {
        return null;
    }

}
