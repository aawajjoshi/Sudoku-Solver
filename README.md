# Soduko-Solver

Sudoku puzzles are hard (it was calculated by Frazer Jarvis in
2005 that there are 6,670,903,752,021,072,936,960 solutions to a
standard 9x9 Sudoku board). A valid Sudoku board (defined here as one
that is unambiguously solvable) can, however, be brute forced. One way
this can be done is using recursion and backtracking to try all possible
values of numbers until a solution is found. A more thorough explanation
of the Sudoku game and its rules follow.

## Sudoku

A Sudoku board consists of a 9x9 grid broken into 9 3x3 blocks (see
Figure 1). Each cell on the must contain a number, 1-9. However, the
final state of the board must follow certain rules:

-   Every row on the board must contain the numbers 1-9

-   Every column on the board must contain the numbers 1-9

-   Every 3x3 block must contain the numbers 1-9


## Following methods are implemented in the SudokuBoard class:

-   `load(String filename)`: loads the board from the specified file

-   `SudokuBoard(String filename)` (constructor): Builds the board and
    loads it from the file

-   `boolean allowed(int row, int col, int value)`: returns whether the
    value is allowed at the row/col position.

-   `boolean allowedInRow(int row, int value)`: returns true if the
    value is allowed in the row, false otherwise.

-   `boolean allowedInCol(int col, int value)`: returns true if the
    value is allowed in the column, false otherwise.

-   `boolean allowedInBlock(int row, int col, int value)`: returns true
    if the value is allowed in the block containing row/col,
    false otherwise.

-   `boolean solve(int row, int col)`: The recursive method that will
    solve the board starting from a specified position.
    
## Authors
-   Aawaj Raj Joshi


