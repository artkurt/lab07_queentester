public class knights {
    public static void main(String[] args) {
        int size = 8;
        boolean[][] board = new boolean[size][size]; // true = Springer platziert

        int count = 0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                // Nur auf Feldern mit (row + col) % 2 == 0 setzen (z.B. schwarze Felder)
                if ((row + col) % 2 == 0) {
                    board[row][col] = true;
                    count++;
                }
            }
        }

        System.out.println("Maximale Anzahl von Springern ohne sich zu bedrohen: " + count);
        printBoard(board);
    }

    private static void printBoard(boolean[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] ? "N " : ". ");
            }
            System.out.println();
        }
    }
}
