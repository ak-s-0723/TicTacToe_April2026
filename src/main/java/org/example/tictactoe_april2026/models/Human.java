package org.example.tictactoe_april2026.models;

import java.util.Scanner;

public class Human extends Player {
    private Integer age;
    private String friendlyName;
    private Integer level;
    private Scanner scanner;

    public Human(Long id,String name,Symbol symbol, String friendlyName) {
      super(id,name,symbol,PlayerType.HUMAN);
      this.friendlyName = friendlyName;
      this.level = 1;
      scanner = new Scanner(System.in);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("Enter row in which you want to make a move");
        int row = scanner.nextInt();
        System.out.println("Enter col in which you want to make a move");
        int col = scanner.nextInt();
        return new Move(new Cell(row,col),this);
    }
}
