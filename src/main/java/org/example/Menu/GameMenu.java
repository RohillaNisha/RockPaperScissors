package org.example.Menu;

import java.util.List;

public class GameMenu extends Menu {


    public GameMenu() {
        super("Choose your game type: ");
        menuOptions = List.of(
                new MenuOption(1,"First to score 3 points WINS ", () -> MenuSystem.setState(new FirstThreeWins())),
                new MenuOption(2,"First to score 5 points WINS ", () -> MenuSystem.setState(new FirstFiveWins())),
                new MenuOption(3,"Back to Main Menu ", () -> MenuSystem.setState(new MainMenu())),
                new MenuOption(4,"Sayonara ", () ->System.exit(0))

                );
    }
}
