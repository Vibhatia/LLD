package org.example.tictactoe;

import java.util.Scanner;

public class HumanPlayer extends Players{
    private final Scanner scanner;

    public HumanPlayer(String name, char piece, Scanner scanner) {
        super(name, piece);
        this.scanner = scanner;
    }
    @Override
    public Move getMove(Board board) {
        while (true) {
            System.out.printf("%s (%c), enter your move as 'row col': ", getName(), getPiece());
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x < 0 || x >= board.getSize() || y < 0 || y >= board.getSize()) {
                System.out.println("Out of bounds, try again.");
                continue;
            }
            if (!board.isCellEmpty(x, y)) {
                System.out.println("Cell already taken, try again.");
                continue;
            }
            return new Move(x, y);
        }
    }
}
