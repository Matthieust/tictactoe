package tictactoe;

public class Player {
    String name;
    Pawn pawn;

    public Player(String name, char c){
        this.name = name;
        this.pawn = new Pawn(c);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return (this.name);
    }
}