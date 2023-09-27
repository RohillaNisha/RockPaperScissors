package org.example.Menu;

import java.util.List;
import java.util.Scanner;

public class MainMenu extends Menu {

    private static final Scanner scanner = new Scanner(System.in);

    public MainMenu() {
        super("Main Menu");
        menuOptions = List.of(
                new MenuOption(1, "Start a new Game",() -> MenuSystem.setState(new GameMenu())),
                new MenuOption(2, "See Game Rules", () -> gameRules()),
                new MenuOption(3, "See Game History",() -> gameHistory() ),
                new MenuOption(4, "Sayonara", () -> System.exit(0))
        );
    }

    public static void gameRules(){
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        System.out.println(" 1. Rock wins against scissors.");
        System.out.println(" 2. Scissors wins against paper.");
        System.out.println(" 3. Paper wins against rock.");
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        System.out.println(" Note:  If both players throw the same hand signal, it is considered a tie, and play resumes until there is a clear winner.");

    }

    public static void gameHistory(){
        System.out.println("HISTORY");
    }
}
