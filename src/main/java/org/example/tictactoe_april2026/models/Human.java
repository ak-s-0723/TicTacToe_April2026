package org.example.tictactoe_april2026.models;

public class Human extends Player {
    private Integer age;
    private String friendlyName;
    private Integer level;

    public Human(Long id,String name,Symbol symbol, String friendlyName) {
      super(id,name,symbol,PlayerType.HUMAN);
      this.friendlyName = friendlyName;
      this.level = 1;
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
}
