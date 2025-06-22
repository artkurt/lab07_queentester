public class main {
    public static void main(String[] args) {
        chessboard cb = new chessboard(10);
        boolean found = cb.solve(0);
        if (!found) {
            System.out.println("Keine Lösung gefunden.");
        } else {
            System.out.println("Es wurden " + cb.getSolutionCount() + " Lösungen gefunden.");
        }
    }
}
