package org.example.tictactoe_april2026;

import org.example.tictactoe_april2026.controllers.GameController;
import org.example.tictactoe_april2026.models.*;
import org.example.tictactoe_april2026.strategies.ColumnWiseWinningStrategy;
import org.example.tictactoe_april2026.strategies.RowWiseWinningStrategy;
import org.example.tictactoe_april2026.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String args[]) {
        GameController gameController = new GameController();

        List<Player> playerList = new ArrayList<>();
        playerList.add(new Human(1L,"Harish",new Symbol('X'),"Potter"));
        playerList.add(new Bot(2L,"JAADU",new Symbol('0'),BotDifficultyLevel.EASY));
        int size = 3;
        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWiseWinningStrategy());
        winningStrategies.add(new ColumnWiseWinningStrategy());
        //You can ask user about each strategy and if he says yes, you can add that
        Game game = gameController.startGame(playerList,winningStrategies,size);

        while (gameController.getGameState(game).equals(GameState.IN_PROGRESS)) {
            gameController.displayBoard(game);
            gameController.makeMove(game);

            if(gameController.getGameState(game).equals(GameState.SUCCESS)) {
                System.out.println("Winner is "+gameController.getWinner(game).getName());
            } else if(gameController.getGameState(game).equals(GameState.DRAW)) {
                System.out.println("Game has ended in Draw");
            }
            System.out.println();
        }

    }
}
