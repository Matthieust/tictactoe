package tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Grid {
    char[][] gameZone = new char[3][3];
    String horziTok;
    String vertiTok;
    List<String> grid = new ArrayList<>();
    List<Pawn> pawns = new ArrayList<>();

    public Grid(){
        this.horziTok = "-";
        this.vertiTok = "|";
    }

    public void createGrid() {
        for(int i = 3; i > 0; i--){
            for (int j = 5; j > 0; j--){
                if (j % 2 != 0){
                    this.grid.add(this.horziTok);
                }
                else{
                    this.grid.add(this.vertiTok);
                }
            }
            this.grid.add("\n");
        }
    }

    public void displayGrid(){
        for (String string : grid) {
            System.out.printf(string);
        }
    }
}