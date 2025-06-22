public class chessboard {
    private int[] board; // board[i] = Spalte der Dame in Zeile i
    private int solutionCount = 0; // Anzahl gefundener Lösungen

    public chessboard(int size) {
        board = new int[size];
        for (int i = 0; i < size; i++) {
            board[i] = -1; // -1 heißt: keine Dame gesetzt
        }
    }

    public boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            int queenCol = board[i];
            if (queenCol == col || Math.abs(i - row) == Math.abs(queenCol - col)) {
                return false; // gleiche Spalte oder gleiche Diagonale
            }
        }
        return true;
    }

    public boolean solve(int row) {
        int size = board.length;
        if (row == size) {
            solutionCount++;
            printBoard();
            return true;
        }

        boolean foundSolution = false;
        for (int col = 0; col < size; col++) {
            if (isSafe(row, col)) {
                board[row] = col; // Dame platzieren
                if (solve(row + 1)) {
                    foundSolution = true;
                }
                board[row] = -1; // zurücksetzen (Backtracking)
            }
        }
        return foundSolution;
    }

    public void printBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (board[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public int getSolutionCount() {
        return solutionCount;
    }
}
