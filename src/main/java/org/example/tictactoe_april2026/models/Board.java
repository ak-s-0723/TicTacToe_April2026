package org.example.tictactoe_april2026.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> cells;
    private Integer size;

    public Board(int size) {
        this.size = size;
        cells = new ArrayList<>();
        for(int i=0; i<size; i++) {
            cells.add(new ArrayList<>());
            for(int j=0; j<size; j++) {
                cells.get(i).add(new Cell(i,j));
            }
        }
    }

    public void display() {
        for(List<Cell> row : cells) {
            for(Cell cell : row) {
                cell.display();
            }
            System.out.println();
        }
    }

    public List<List<Cell>> getCells() {
        return cells;
    }

    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
