package org.example.tictactoe_april2026.models;

public class Cell {
    private int row;
    private int col;
    private Symbol symbol;
    private CellState cellState;

    public Cell(int i,int j) {
        this.row = i;
        this.col = j;
        this.cellState = CellState.EMPTY;
        this.symbol = null;
    }

    public void display() {
        if (cellState.equals(CellState.EMPTY)) {
            System.out.print("| - |");
        } else {
            System.out.print("| "+symbol.getCharacter()+" |");
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }
}
