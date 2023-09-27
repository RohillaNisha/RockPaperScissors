package org.example.Player;

import java.util.Scanner;

public class HumanPlayer implements Player {

    @Override
    public String makeAMove() {
        System.out.println(" Computer has made its move. Now its your turn.");
        System.out.println("Make a move: ROCK , PAPER OR SCISSORS ??");
        Scanner scanner = new Scanner(System.in);
        String inputHumanMove = scanner.nextLine();
        return inputHumanMove;
    }
}
