package Chessboard.model;

public class Game {
    private  Player[] players;
    private Player  currentTurn;
    private Board board;
    private GameStatus gameStatus;
    void initialize(Player p1, Player p2) {
        players[0] = p1;
        players[0] = p2;
        board.initlizeBoard();
    }
    public boolean playerMove(Player player, int startX, int startY, int endX, int endY){
          return true;
    }
}
