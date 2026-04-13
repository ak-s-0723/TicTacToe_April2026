package org.example.tictactoe_april2026.strategies;

import org.example.tictactoe_april2026.models.Board;
import org.example.tictactoe_april2026.models.Move;

public interface WinningStrategy {
    Boolean checkWinner(Move move, Board board);
}
