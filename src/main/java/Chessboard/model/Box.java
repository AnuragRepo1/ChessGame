package Chessboard.model;

public class Box {
    private Piece piece;
    int x;
    int y;

    public Box(Piece piece, int x, int y) {
        this.piece = piece;
        this.x = x;
        this.y = y;
    }
}
