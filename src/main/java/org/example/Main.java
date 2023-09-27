package org.example;

import org.example.GameController.GameController;
import org.example.GameModel.RockPaperScissorsModel;
import org.example.GameView.GameView;
import org.example.GameView.TerminalGameView;
import org.example.Menu.FirstThreeWins;
import org.example.Menu.MenuSystem;
import org.example.Player.HumanPlayer;
import org.example.Player.Player;
import org.example.Player.RandomComputerPlayer;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n \n");
        System.out.println("........ROCK PAPER SCISSORS........ \n \n");


        RockPaperScissorsModel gameModel = createGameModel();
        GameView gameView = createGameView();
        MenuSystem menuSystem = MenuSystem.getInstance();
        GameController gameController = new GameController(gameModel, menuSystem, gameView);
        while( !MenuSystem.getCurrentState().equals("FirstThreeWins")){
            menuSystem.execute();
        }

        gameController.startGame();
        while(true){
            menuSystem.execute();
        }

        }

        private static RockPaperScissorsModel createGameModel(){
        Player humanPlayer = new HumanPlayer();
        Player computerPlayer = new RandomComputerPlayer();
        return new RockPaperScissorsModel(humanPlayer, computerPlayer);
        }

        private static GameView createGameView(){
            return new TerminalGameView();
        }
    }
