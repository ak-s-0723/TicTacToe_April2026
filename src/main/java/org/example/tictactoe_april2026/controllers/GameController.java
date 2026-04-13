package org.example.tictactoe_april2026.controllers;

import org.example.tictactoe_april2026.models.Game;
import org.example.tictactoe_april2026.models.GameState;
import org.example.tictactoe_april2026.models.Player;
import org.example.tictactoe_april2026.strategies.WinningStrategy;

import java.util.List;

//CRUD -> Create Read Update Delete
public class GameController {

    public Game startGame(List<Player> players, List<WinningStrategy> winningStrategies,int boardSize) {
        Game game = new Game(players,winningStrategies,boardSize);
        return game;

    }

    public void displayBoard(Game game) {

    }

    public GameState getGameState(Game game) {
      return game.getGameState();
    }

    public void undo() {

    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void makeMove(Game game) {
      game.makeMove();
    }
}


