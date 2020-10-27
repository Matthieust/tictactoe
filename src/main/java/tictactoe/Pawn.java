package tictactoe;

public class Pawn {
    private String type;
    private int pos;

    public Pawn(String type){
        this.type = type;
    }

    public int getPos() {
        return this.pos;
    }
}