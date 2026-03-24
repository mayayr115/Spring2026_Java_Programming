package Lab.Lab08;

public class TicTacToeGame {
    private char[][] board;
    private int turns;

    private static final char X = 'X';
    private static final char O = 'O';
    private static final char EMPTY = ' ';
    private static final char OUT_OF_BOUNDS = '@';

    /**
     * Creates a new tic-tac-toe game instance and initializes the
     * internal state of the game. After this method is called, the
     * newly created game board is filled with '_' (empty spaces) to
     * indicate that players have not yet occupied any spots.
     */
    public TicTacToeGame() {
        board = new char[3][3];
        turns = 0;

        for (int r = 0; r < 3; r++ ) {
            for (int c = 0; c < 3; c++ ) {
                board[r][c] = EMPTY;
            }
        }
    }

    /**
     * Makes a move for the specified player, {@code p}, at location
     * ({@code r}, {@code c}) within the game board. If the move is invalid,
     * the method has no effect on the underlying board. The move is invalid
     * when the space is already occupied or the space is out of bounds.
     * Note: This method also increases the number of turns played if the move
     * is successful.
     *
     * @param p the character representing the player making the move.
     * @param r the row where the move is being made.
     * @param c the column where the move is being made.
     */
    public void playMove( char p, int r, int c ) {
        //Replace the lines below with your implementation of the method.
        System.out.println("playMove is not implemented yet");
        System.exit(0);
    }

    /**
     * Returns whether the specified character, {@code p}, has
     * won the game.
     *
     * @return {@code true} if {@code p} has won the game and {@code false}
     * otherwise.
     * @param p the character to check.
     */
    public boolean isWinner( char p ) {
        //Replace the lines below with your implementation of the method.
        System.out.println("isWinner is not implemented yet");
        System.exit(0);
        return false;
    }

    /**
     * Returns whether the game board is full.
     *
     * @return {@code true} if the board is full and {@code false} otherwise.
     */
    public boolean isFull() {
        //Replace the lines below with your implementation of the method.
        System.out.println("isFull is not implemented yet");
        System.exit(0);
        return false;
    }

    /**
     * Returns whether the game is a tie or not.
     * @return {@code true} if the game is a tie and {@code false} otherwise.
     */
    public boolean isTie() {
        //Replace the lines below with your implementation of the method.
        System.out.println("isTie is not implemented yet");
        System.exit(0);
        return false;
    }


    /**
     * Returns whether the specified coordinates, {@code r} and {@code c} fall
     * within the boundaries of the game board.
     * @param r the row number to check.
     * @param c the column number to check.
     * @return {@code true} if the specified coordinates are in bounds and
     * {@code false} otherwise.
     */
    public boolean isInBounds( int r, int c ) {
        if (0 <= r && r <= 2 && 0 <= c && c <= 2) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the number of turns taken so far in the game.
     * @return the number of turns taken so far.
     */
    public int numTurns() {
        return turns;
    }

    /**
     * Returns the player occupying the board location at the specified coordinates,
     * {@code r} and {@code c}.
     * @param r the row value to check.
     * @param c the column value to check.
     * @return the character representing the player located at position
     * ({@code r},{@code c} on the board. If the location is out of bounds, the method
     * returns the {@code @} character.
     */
    public char playerAt( int r, int c ) {
        if (isInBounds(r,c)) {
            return board[r][c];
        } else {
            return OUT_OF_BOUNDS;
        }
    }

    //Prints the contents of the game board.
    public void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

}