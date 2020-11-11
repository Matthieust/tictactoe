package tictactoe;

import java.util.Scanner;

public final class App {
    private App() {
    }

    static boolean win(Grid grid, int pos, char c){
        switch (pos) {
            case 1:
                if ((grid.gameZone[0][1] == c && grid.gameZone[0][2] == c) ||
                    (grid.gameZone[1][1] == c && grid.gameZone[2][2] == c) ||
                    (grid.gameZone[1][0] == c && grid.gameZone[2][0] == c)
                ){
                    return true;
                }
                else {
                    return false;
                }
            case 2:
                if ((grid.gameZone[0][0] == c && grid.gameZone[0][2] == c) ||
                    (grid.gameZone[1][1] == c && grid.gameZone[2][1] == c)
                ){
                    return true;
                }
                else {
                    return false;
                }
            case 3:
                if ((grid.gameZone[0][0] == c && grid.gameZone[0][1] == c) ||
                    (grid.gameZone[1][1] == c && grid.gameZone[2][0] == c) ||
                    (grid.gameZone[1][2] == c && grid.gameZone[2][2] == c)
                ){
                    return true;
                }
                else {
                    return false;
                }
            case 4:
               if ((grid.gameZone[1][1] == c && grid.gameZone[1][2] == c) ||
                    (grid.gameZone[0][0] == c && grid.gameZone[2][0] == c)
                ){
                    return true;
                }
                else {
                    return false;
                }
            case 5:
                if ((grid.gameZone[0][0] == c && grid.gameZone[2][2] == c) ||
                    (grid.gameZone[0][1] == c && grid.gameZone[2][1] == c) ||
                    (grid.gameZone[0][2] == c && grid.gameZone[2][0] == c) ||
                    (grid.gameZone[1][0] == c && grid.gameZone[1][2] == c)
                ){
                    return true;
                }
                else {
                    return false;
                }
            case 6:
                if ((grid.gameZone[1][0] == c && grid.gameZone[1][1] == c) ||
                    (grid.gameZone[0][2] == c && grid.gameZone[2][2] == c)
                ){
                    return true;
                }
                else {
                    return false;
                }
            case 7:
                if ((grid.gameZone[1][1] == c && grid.gameZone[1][2] == c) ||
                    (grid.gameZone[0][0] == c && grid.gameZone[1][0] == c) ||
                    (grid.gameZone[2][1] == c && grid.gameZone[2][2] == c)
                ){
                    return true;
                }
                else {
                    return false;
                }
            case 8:
                if ((grid.gameZone[2][0] == c && grid.gameZone[2][2] == c) ||
                    (grid.gameZone[1][1] == c && grid.gameZone[0][1] == c) 
                ){
                    return true;
                }
                else {
                    return false;
                }
            case 9:
                if ((grid.gameZone[0][0] == c && grid.gameZone[1][1] == c) ||
                    (grid.gameZone[2][0] == c && grid.gameZone[2][1] == c) ||
                    (grid.gameZone[0][2] == c && grid.gameZone[1][2] == c)
                ){
                    return true;
                }
                else {
                    return false;
                }
            default:
            return false;
            }
    }

    static void fillBoard(int pos, char pawn, Grid grid){
        //TODO : change this line pos / 3 col pos % 3, check 3 6 9 special case 
        switch (pos) {
            case 1:
                grid.gameZone[0][0] = pawn;
                break;
            case 2:
                grid.gameZone[0][1] = pawn;
                break;
            case 3:
                grid.gameZone[0][2] = pawn;
                break;
            case 4:
                grid.gameZone[1][0] = pawn;
                break;
            case 5:
                grid.gameZone[1][1] = pawn;
                break;
            case 6:
                grid.gameZone[1][2] = pawn;
                break;
            case 7:
                grid.gameZone[2][0] = pawn;
                break;
            case 8:
                grid.gameZone[2][1] = pawn;
                break;
            case 9:
                grid.gameZone[2][2] = pawn;
                break;
        }
    }

    static void game(Player player1, Player player2, Grid grid){
        boolean turn = true;
        boolean win = false;
        Scanner scan = new Scanner(System.in);
        int pos;

        while (!win){
            if (turn) {
                //player1 play
                System.out.printf("%s Where place you pawn ?", player1.getName());
                pos = scan.nextInt();
                fillBoard(pos, player1.pawn.getPawn(), grid);
                turn = false;
                //check win
                win = win(grid, pos, player1.pawn.getPawn());
            }
            else {
                //player2 play
                //player1 play
                System.out.printf("%s Where place you pawn ?", player2.getName());
                pos = scan.nextInt();
                fillBoard(pos, player2.pawn.getPawn(), grid);
                turn = true;
                //check win
                win = win(grid, pos, player2.pawn.getPawn());
            }
        }
        scan.close();
    }
    public static void main(String[] args) {
        Grid grid = new Grid();
        grid.createGrid();
        
        //create setPlayers
        Player player1 = new Player("player1", 'X');
        Player player2 = new Player("player2", 'O');

        game(player1, player2, grid);
        // grid.displayGrid();
    }
}
