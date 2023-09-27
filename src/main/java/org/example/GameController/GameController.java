package org.example.GameController;

import org.example.GameModel.RockPaperScissorsModel;
import org.example.GameView.GameView;
import org.example.Menu.MenuSystem;

public class GameController {
    private RockPaperScissorsModel rpsModel;
    private MenuSystem menuSystem;
    private GameView gameView;


    public GameController(RockPaperScissorsModel rpsModel,MenuSystem menuSystem, GameView gameView) {
        this.rpsModel = rpsModel;
        this.menuSystem = menuSystem;
        this.gameView = gameView;

    }

    public void startGame(){

      while(true){

         menuSystem.execute();
         rpsModel.initializeGame();
         String computerMove = rpsModel.makeComputerMove();
         String yourMove =  rpsModel.makeHumanMove();
         String singleRoundWinner = rpsModel.scoreUpdation(yourMove, computerMove);
         System.out.println(singleRoundWinner + " wins this round. "+ singleRoundWinner + " , score is updated.");
         int humanScore = rpsModel.getHumanScore();
         int computerScore = rpsModel.getComputerScore();
        gameView.displayGameProgress(humanScore, computerScore);

         if(isGameOver()){
             break;

            }


        }

        displayGameResults();

    }

    private boolean isGameOver(){
        return rpsModel.isGameOver(3);
    }

    private void displayGameResults(){
        int humanScore = rpsModel.getHumanScore();
        int computerScore = rpsModel.getComputerScore();
       String winner = rpsModel.determineWinnerOfTheGame( humanScore, computerScore);
       gameView.displayGameResult(winner, humanScore, computerScore);

    }
}



