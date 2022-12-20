package com.seungminyi95.hangman.repository;

public interface HangmanRepository {

    HangmanSnapshot getSnapshot(String userId);

    boolean setSnapshot(String userId, HangmanSnapshot snapshot);
}

