public class queentester {
    public static void main(String[] args) {
        for (int n = 1; n <= 8; n++) {
            chessboard cb = new chessboard(n);
            boolean found = cb.solve(0);
            System.out.println("N = " + n + ": " + (found ? "Lösung gefunden" : "Keine Lösung"));
        }
    }
}
