package tictactoe;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Grid grid = new Grid();
        Player player1 = new Player("player1", "X");
        // Player player2 = new Player("player2", "O");
        grid.createGrid();
        grid.displayGrid();
        // System.out.println(player1.pawns.get(0).getPos());
        // System.out.println(player2.pawn.type);
    }
}
