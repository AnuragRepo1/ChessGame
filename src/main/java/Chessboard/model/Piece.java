package Chessboard.model;

public abstract class Piece {
    private boolean isKilled;
    private boolean isWhite;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }
    public abstract void canMove(Board board, Box start, Box end);

    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }
}
