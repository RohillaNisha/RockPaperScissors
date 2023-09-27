package org.example.GameView;

public interface GameView {
    void displayGameProgress(int humanScore, int computerScore);
    void displayGameResult(String winner, int humanScore, int computerScore);
}
