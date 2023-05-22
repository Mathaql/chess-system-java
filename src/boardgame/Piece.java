package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Position position) {
        this.position = position; //if position equals empty, position equals null
    }

    protected Board getBoard() {
        return board;
    }

}
