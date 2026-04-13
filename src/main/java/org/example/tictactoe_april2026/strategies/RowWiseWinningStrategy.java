package org.example.tictactoe_april2026.strategies;

import org.example.tictactoe_april2026.models.Board;
import org.example.tictactoe_april2026.models.Move;

import java.util.HashMap;

public class RowWiseWinningStrategy implements WinningStrategy {
    private HashMap<Integer,HashMap<Character,Integer>> rowCounts = new HashMap<>();
    @Override
    public Boolean checkWinner(Move move, Board board) {
        int row = move.getCell().getRow();
        Character character = move.getPlayer().getSymbol().getCharacter();
        if(!rowCounts.containsKey(row)) {
            rowCounts.put(row,new HashMap<>());
        }

        HashMap<Character,Integer> counts = rowCounts.get(row);
        if(!counts.containsKey(character)) {
            counts.put(character,0);
        }

        counts.put(character,counts.get(character)+1);
        if(counts.get(character) == board.getSize()) {
            return true;
        }

        return false;



       // rowCounts.get(row).get('X') == board.size();



    }
}
