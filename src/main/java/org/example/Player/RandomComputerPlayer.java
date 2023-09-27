package org.example.Player;

import java.util.Random;

public class RandomComputerPlayer implements Player{

    private Random random;

    public RandomComputerPlayer() {
        random = new Random();
    }

    @Override
    public String makeAMove() {
        // Generates a random number between 0 and 2
        int randomNumber = random.nextInt(3);

        // Map the random number to a move ( 0 = ROCK , 1 = PAPER , 2 = SCISSORS )
        String[] moves = { "ROCK", "PAPER", "SCISSORS"};
        String randomMove = moves[randomNumber];
        return randomMove;
    }
}
