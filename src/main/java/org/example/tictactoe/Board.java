package org.example.tictactoe;

import java.util.Arrays;

public class Board {
    private int size;
    private char[][] grid;
    public static final char EMPTY = '-';

    public Board(int size){
        this.size = size;
        this.grid = new char[size][size];

        for(char[] row : grid) {
            Arrays.fill(row, EMPTY);
        }
    }

    public int getSize(){
        return size;
    }

    public char getCell(int x,int y){
        return grid[x][y];
    }

    public void mark(int x,int y,char piece){
        if(!isCellEmpty(x,y))
            throw new IllegalArgumentException("Cell is already filled");
        grid[x][y] = piece;
    }

    public boolean isCellEmpty(int x,int y){
        return grid[x][y] == EMPTY;
    }

    public void print() {
        for (int x = 0; x < size; x++) {
            StringBuilder row = new StringBuilder();
            for (int y = 0; y < size; y++) {
                row.append(grid[x][y]).append(' ');
            }
            System.out.println(row.toString().trim());
        }
    }

    public boolean isFull() {
        for (char[] row : grid) {
            for (char cell : row) {
                if (cell == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


}
