/**
 *Java 1. Homework #4.
 *
 * @author Grave Elizaveta
 * @version 21.02.2022
 *
 */

import java.util.Scanner;
import java.util.Random;

class TicTacToe {

    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';

    char[][]table;

    Scanner scanner;
    Random random;

    public static void main(String[]args) {
        new TicTacToe().game();
    }

    TicTacToe() {
        table = new char[3][3];
        scanner = new Scanner(System.in);
        random = new Random();
    }


    // Play logic
    void game() {
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (isWin(SIGN_X)) {
                System.out.println("YOU WON");
                break;
            }
            if (isTableFull()) {
                System.out.println("SORRY, DRAW");
                break;
            }
            turnAi();
            printTable();
            if (isWin(SIGN_O)) {
                System.out.println("YOU LOOSE");
                break;
                if (isTableFull()) {
                    System.out.println("SORRY, DRAW");
                    break;
                }
            }
            printTable();
        }

        // Map initiation
        void initTable() {
            for (int y = 0; y < table.length; y++) {
                for (int x = 0; x < table.length; x++) {
                    table[x][y] = SIGN_EMPTY;
                }
            }
        }

        // Table print
        void printTable() {
            for (int y = 0; y < table.length; y++) {
                for (int x = 0; x < table.length; x++) {
                    System.out.print(table[x][y] + " ");
                }
                System.out.println();
            }
        }

        // Human turn
        void turnHuman() {
            int x, y;
            do {
                System.out.println("Enter x y [1..3]: ");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
            } while (!isCellValid(x, y));
            table[x][y] = SIGN_X;
        }

        // Computer turn
        void turnAi() {
            int x, y;
            do {
                x = random.nextInt(3);
                y = random.nextInt(3);
            } while (!isCellValid(x, y));
            table[x][y] = SIGN_O;
        }

        // Cell check
        boolean isCellValid(int x, int y) {
            if (x < 0 || y < 0 || x > 2 || y > 2) {
                return false;
            }
            return table[x][y] == SIGN_EMPTY;
        }

        // Win check
        boolean isWin(char ch) {
            for (int i = 0; i < 3; i++)
                if ((table[i][0] == ch && table[i][1] == ch && table[i][2] == ch) || (table[0][i] == ch && table[1][i] == ch && table[2][i] == ch)) {
                    return true;
                }
            if ((table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) || (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch)) {
                return true;
            }
            return false;
        }
    }

    // Full table
    boolean isTableFull() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                if (table[x][y] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

}