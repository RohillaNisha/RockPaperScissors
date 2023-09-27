package org.example.Player;

public class TacticalComputerPlayerFactory implements PlayerFactory{
    @Override
    public Player createComputerPlayer() {
        return new TacticalComputerPlayer();
    }
}
