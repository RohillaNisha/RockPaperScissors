package org.example.Player;

public class NameBasedComputerPlayerFactory implements PlayerFactory{
    @Override
    public Player createComputerPlayer() {
        return new NameBasedComputerPlayer();
    }
}
