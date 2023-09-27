package org.example.Player;

public class RandomComputerPlayerFactory implements PlayerFactory{
    @Override
    public Player createComputerPlayer() {
        return new RandomComputerPlayer();
    }
}
