package org.example.GameModel;

import org.example.Player.Player;

public class RockPaperScissorsModel {
    private Player humanPlayer;
    private Player computerPlayer;
    private int humanScore;
    private int computerScore;

    public RockPaperScissorsModel(Player humanPlayer, Player computerPlayer) {
        this.humanPlayer = humanPlayer;
        this.computerPlayer = computerPlayer;
        this.humanScore = 0;
        this.computerScore = 0;
    }

    // Set the game scores to 0 when game starts
    public void initializeGame(){
        humanScore = 0;
        computerScore = 0;
    }

    public String makeHumanMove(){
        return humanPlayer.makeAMove();
    }

    public String makeComputerMove(){
        return computerPlayer.makeAMove();
    }

    public int getHumanScore() {
        return humanScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public String scoreUpdation(String humanMove, String computerMove){

        if(humanMove.equals(computerMove) )
        {
            System.out.println("It's a TIE! ");
        }
        else if (humanMove.equals("ROCK"))
        {
            if(computerMove.equals("PAPER")){
                if(isGameOver(3))
                {
                   String winner= determineWinnerOfTheGame(humanScore, computerScore);
                }
                else {computerScore++;
                System.out.println("Your Opponent Wins! ");
                System.out.println("Chose your next move carefully!");
                return "computer";
            }}
            else if(computerMove.equals("SCISSORS")){
                if(isGameOver(3))
                {
                    String winner= determineWinnerOfTheGame(humanScore, computerScore);
                }
                else {
                    humanScore++;
                System.out.println("Well Done! You WON! ");
                System.out.println("Beware! Opponent is furious! ");
                return "you";
            }}
        }
        else if(humanMove.equals("PAPER"))
        {
            if(computerMove.equals("ROCK")){
                if(isGameOver(3))
                {
                    String winner= determineWinnerOfTheGame(humanScore, computerScore);
                }
                else {
                    humanScore++;
                System.out.println("Well Done! You WON! ");
                System.out.println("Beware! Opponent is furious! ");
                return "you";
            }   }
            else if(computerMove.equals("SCISSORS")){
                if(isGameOver(3))
                {
                    String winner= determineWinnerOfTheGame(humanScore, computerScore);
                }
                else {computerScore++;
                System.out.println("Your Opponent Wins! ");
                System.out.println("Chose your next move carefully!");
                return "computer";
            }}
        }
        else if(humanMove.equals("SCISSORS"))
        {
            if(computerMove.equals("ROCK")){
                if(isGameOver(3))
                {
                    String winner= determineWinnerOfTheGame(humanScore, computerScore);
                }
                else {computerScore++;
                System.out.println("Your Opponent Wins! ");
                System.out.println("Chose your next move carefully!");
                return "computer";

            }}
            else if(computerMove.equals("PAPER")){
                if(isGameOver(3))
                {
                    String winner= determineWinnerOfTheGame(humanScore, computerScore);
                }
                else {  humanScore++;
                System.out.println("Well Done! You WON! ");
                System.out.println("Beware! Opponent is furious! ");
                return "you";
            }}
        } return null;

    }


    public boolean isGameOver (int gameType){
        if(gameType == 3){
            if( computerScore == 3 || humanScore == 3){
                return true;
            }
        }
       else if(gameType == 5){
           if(computerScore == 5 || humanScore == 5){
               return true;
           }
        } return false;
    }

    public String determineWinnerOfTheGame(int humanScore, int computerScore){
        if(humanScore > computerScore){
            return "YOU";
        } else if (computerScore > humanScore) {
            return "COMPUTER";
        }
        else if( computerScore == humanScore){
            return "TIE";
        }
        return null;
    }

}
