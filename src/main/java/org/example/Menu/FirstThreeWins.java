package org.example.Menu;

import org.example.Player.HumanPlayer;
import org.example.Player.Player;
import org.example.Player.PlayerFactory;
import org.example.Player.RandomComputerPlayerFactory;

import java.util.List;

public class FirstThreeWins extends Menu  {

    Player humanPlayer = new HumanPlayer();
    PlayerFactory playerFactory = null;

    public FirstThreeWins() {
        super("Select Your Opponent: ");
        menuOptions = List.of(
                new MenuOption(1, "Random move maker", () -> gameAgainstRandomMoveMaker()),
                new MenuOption(2, "Tactical move maker", () -> gameAgainstTacticalMoveMaker()),
                new MenuOption(3, "Name based move maker", () -> gameAgainstNameBasedMoveMaker()),
                new MenuOption(4, "Go back tp previous menu",() -> MenuSystem.setState(new GameMenu())),
                new MenuOption(5, "Sayonara", () -> System.exit(0))
        );
    }

    public void gameAgainstRandomMoveMaker(){
     playerFactory = new RandomComputerPlayerFactory();
     Player computerPlayer = playerFactory.createComputerPlayer();
     String computersMove = computerPlayer.makeAMove();
     System.out.println(" Your opponent has chosen its move. Chose your move now! ");


    }
    public void gameAgainstTacticalMoveMaker(){

    }

    public void gameAgainstNameBasedMoveMaker(){

    }

}
