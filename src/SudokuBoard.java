
/**
 * Class: 44-242 Data Structures
 * Author: Aawaj Raj Joshi
 * Description: Project 2
 * Due: 11/2/2017
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student.
 * I have not given my code to any other student and will not share this code
 * with anyone under any circumstances.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author squishy
 */
public class SudokuBoard {

    private final int[][] board;

    public SudokuBoard(String fname) throws FileNotFoundException {
        board = new int[9][9];
        load(fname);
    }

    public void load(String fname) throws FileNotFoundException {
       
        File file = new File(fname);
        Scanner scan = new Scanner(file);

        while (scan.hasNext()) {

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {

                    board[i][j] = scan.nextInt();
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) {
                printHdiv();
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0) {
                    System.out.print("| ");
                }
                System.out.print(board[i][j]);
                System.out.print(" ");
            }
            System.out.println("|");
        }
        printHdiv();
    }

    private static void printHdiv() {
        int DIV_LEN = 25;
        // divider
        for (int i = 0; i < DIV_LEN; i++) {
            System.out.print('-');
        }
        System.out.println("");
    }

    private boolean allowedInRow(int row, int value) {
        
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == value) {
                return false;
            }
        }
        return true;
    }

    private boolean allowedInCol(int col, int value) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == value) {
                return false;
            }

        }

        return true;
    }

    private boolean allowedInBlock(int row, int col, int value) {
        
        int blockRowStart = row / 3 * 3;
        int blockColStart = col / 3 * 3;

        for (int r = blockRowStart; r < blockRowStart + 3; r++) {
            for (int c = blockColStart; c < blockColStart + 3; c++) {
                if (board[r][c] == value) {
                    return false;
                }  
            }
        }
        return true;
    }

    private boolean allowed(int row, int col, int value) {
        return allowedInRow(row, value) && allowedInCol(col, value)
                && allowedInBlock(row, col, value);
    }

    // solution functions
    public boolean solve() {
        return solve(0, 0);
    }

    public boolean solve(int row, int col) {
        if (col == 9) {
            col = 0;
            row++;
        }
        if (row == 9) {
            return true;
        }
        if (board[row][col] == 0) {
            for (int val = 1; val <= 9; val++) {
                if (allowed(row, col, val)) {
                    board[row][col] = val;
                    if (solve(row, col + 1) == true) {
                        return true;
                    }
                    board[row][col] = 0;
                }
            }
            return false;

        } else {
            return solve(row, col + 1);
        }
    }
}
