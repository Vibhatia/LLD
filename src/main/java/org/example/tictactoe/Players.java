package org.example.tictactoe;

public abstract class Players {
    String name;
    Character piece;

    public Players(String name,Character piece){
        this.name = name;
        this.piece = piece;
    }

    public Character getPiece() {
        return piece;
    }

    public String getName() {
        return name;
    }

    public abstract Move getMove(Board board);

}
