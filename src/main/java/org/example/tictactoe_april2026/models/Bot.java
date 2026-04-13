package org.example.tictactoe_april2026.models;

import java.util.List;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(Long id,String name,Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(id,name,symbol,PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
    }


    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public Move makeMove(Board board) {
       // Adding logic to add symbol to first empty cell as per easy strategy
        // Scan the board and Fill first empty cell
        for(List<Cell> row : board.getCells()) {
            for(Cell cell : row) {
                if(cell.getCellState().equals(CellState.EMPTY)) {
                    //Bot should make move in this cell
                    return new Move(cell,this);
                }
            }
        }
        return null;
    }
}
