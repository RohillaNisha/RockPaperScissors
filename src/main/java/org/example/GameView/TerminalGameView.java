package org.example.GameView;

import org.example.Menu.MenuSystem;

public class TerminalGameView implements GameView{


    @Override
    public void displayGameProgress (int humanScore, int computerScore) {
            System.out.println("Your Score: "+ humanScore);
            System.out.println("Opponent's Score: "+ computerScore);
    }

    @Override
    public void displayGameResult(String winner, int humanScore, int computerScore) {

        System.out.println(".................GAME OVER.................");
        System.out.println("Your Score: "+ humanScore);
        System.out.println("Computer's Score: "+ computerScore);

        if(humanScore > computerScore){
            System.out.println("........YOU WON! ............. ");
        } else if (computerScore > humanScore) {
            System.out.println(".........YOUR OPPONENT WON! ..........");

        }
        else{
            System.out.println(" IT'S A TIE!  ");
        }

    }
}
