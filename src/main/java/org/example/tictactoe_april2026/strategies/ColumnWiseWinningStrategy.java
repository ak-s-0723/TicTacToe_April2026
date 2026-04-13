package org.example.tictactoe_april2026.strategies;

import org.example.tictactoe_april2026.models.Board;
import org.example.tictactoe_april2026.models.Move;

import java.util.HashMap;

public class ColumnWiseWinningStrategy implements WinningStrategy {
    private HashMap<Integer,HashMap<Character,Integer>> colCounts = new HashMap<>();
    @Override
    public Boolean checkWinner(Move move, Board board) {
        int col = move.getCell().getCol();
        Character character = move.getPlayer().getSymbol().getCharacter();
        if(!colCounts.containsKey(col)) {
            colCounts.put(col,new HashMap<>());
        }

        HashMap<Character,Integer> counts = colCounts.get(col);
        if(!counts.containsKey(character)) {
            counts.put(character,0);
        }

        counts.put(character,counts.get(character)+1);
        if(counts.get(character) == board.getSize()) {
            return true;
        }

        return false;
    }
}
