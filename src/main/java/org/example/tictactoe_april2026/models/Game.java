package org.example.tictactoe_april2026.models;

import org.example.tictactoe_april2026.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Integer nextPlayerIndex;
    private GameState gameState;
    private List<Move> moves;
    private List<WinningStrategy> winningStrategies;
    private Player winner;

    private Boolean validateMove(Move move) {
        return board.getCells().get(move.getCell().getRow()).get(move.getCell().getCol()).getCellState().equals(CellState.EMPTY);
    }


    public void displayBoard() {
       board.display();
    }

    public void makeMove() {
        Player player = players.get(nextPlayerIndex);
        Move move = player.makeMove(board);

        if(!validateMove(move)) {
            System.out.println("MOVE IS INVALID");
            // you can have a while loop or throw an exception
        }

        Cell cellToChange = move.getCell();
        cellToChange.setCellState(CellState.FILLED);
        cellToChange.setSymbol(move.getPlayer().getSymbol());
        moves.add(move);
        nextPlayerIndex++;
        nextPlayerIndex%=players.size(); //circularly come back0

        for(WinningStrategy winningStrategy : winningStrategies) {
            if(winningStrategy.checkWinner(move,board)) {
                this.setGameState(GameState.SUCCESS);
                this.winner = player;
                System.out.println("Congrats, "+winner.getName());
                return;
            }
        }

        if(moves.size() == board.getSize()*board.getSize()) {
            this.setGameState(GameState.DRAW);
            System.out.println("DRAW");
        }
    }


    public Game(List<Player> players,
                List<WinningStrategy> winningStrategies,
                int boardSize) {
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.winner = null;
        this.gameState = GameState.IN_PROGRESS;
        this.moves = new ArrayList<>();
        this.nextPlayerIndex = 0;
        this.board = new Board(boardSize);

    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Integer getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(Integer nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }
}
