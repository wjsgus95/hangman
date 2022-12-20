package com.seungminyi95.hangman.repository;

import org.springframework.stereotype.Service;

@Service
public class SimpleHangmanRepository implements HangmanRepository {
    @Override
    public HangmanSnapshot getSnapshot(String userId) {
        return null;
    }

    @Override
    public boolean setSnapshot(String userId, HangmanSnapshot snapshot) {
        return false;
    }

}
