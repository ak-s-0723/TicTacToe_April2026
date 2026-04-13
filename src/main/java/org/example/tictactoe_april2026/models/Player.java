package org.example.tictactoe_april2026.models;

public abstract class Player {

    public Player(Long id,String name,Symbol symbol,PlayerType playerType) {
        this.id = id;
        this.name =name;
        this.playerType = playerType;
        this.symbol = symbol;
    }

    private Long id;
    private String name;
    private Symbol symbol;
    private PlayerType playerType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
