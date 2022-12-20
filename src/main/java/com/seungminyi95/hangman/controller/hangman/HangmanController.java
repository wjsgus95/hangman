package com.seungminyi95.hangman.controller.hangman;

import com.seungminyi95.hangman.controller.ApiEndpoint;
import com.seungminyi95.hangman.controller.hangman.dto.*;
import com.seungminyi95.hangman.service.HangmanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(ApiEndpoint.API_V0 + "/hangman")
public class HangmanController {
    private final HangmanService hangmanService;

    @PostMapping("/action")
    public ActionResponse action(ActionRequest request) {
        return hangmanService.action(request);
    }
}
