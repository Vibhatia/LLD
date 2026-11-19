package org.example.tictactoe;

import java.util.List;

public class Game {
    private final Board board;
    private final Players[] players;
    private int currentPlayerIndex;


    public Game(Board board, Players[] players) {

        this.board = board;
        this.players = players;
        this.currentPlayerIndex = 0;
    }

    public void play(){
        while(true){
            board.print();
            Players current = players[currentPlayerIndex];
            Move move = current.getMove(board);
            mark(move.getX(), move.getY(), current.getPiece());

            if (checkWin()) {
                board.print();
                System.out.println(current.getName() + " wins!");
                return;
            }
            if (checkDraw()) {
                board.print();
                System.out.println("It's a draw!");
                return;
            }
            switchTurn();


        }
    }

    public void mark(int x,int y,char piece){
        board.mark(x,y,piece);
    }

    public boolean checkWin() {
        int size = board.getSize();

        // Rows and columns
        for (int i = 0; i < size; i++) {
            if (lineWins(board.getCell(i, 0), rowValues(i)) ||
                    lineWins(board.getCell(0, i), colValues(i))) {
                return true;
            }
        }
        // Diagonals
        return lineWins(board.getCell(0, 0), diagValues()) ||
                lineWins(board.getCell(0, size - 1), antiDiagValues());
    }

    public boolean checkDraw() {
        return !checkWin() && board.isFull();
    }

    public void switchTurn() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
    }

    private boolean lineWins(char first, char[] values) {
        if (first == Board.EMPTY) return false;
        for (char v : values) {
            if (v != first) return false;
        }
        return true;
    }


    private char[] rowValues(int x) {
        int size = board.getSize();
        char[] values = new char[size];
        for (int y = 0; y < size; y++) values[y] = board.getCell(x, y);
        return values;
    }

    private char[] colValues(int y) {
        int size = board.getSize();
        char[] values = new char[size];
        for (int x = 0; x < size; x++) values[x] = board.getCell(x, y);
        return values;
    }

    private char[] diagValues() {
        int size = board.getSize();
        char[] values = new char[size];
        for (int i = 0; i < size; i++) values[i] = board.getCell(i, i);
        return values;
    }

    private char[] antiDiagValues() {
        int size = board.getSize();
        char[] values = new char[size];
        for (int i = 0; i < size; i++) values[i] = board.getCell(i, size - 1 - i);
        return values;
    }
}
