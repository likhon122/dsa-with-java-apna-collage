package OOPS.abstraction;

public class Interfaces {

    static void main(String[] args) {
        King k = new King();
        k.moves();
    }

}

interface ChessPlayer{
    void moves();
}


class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, bottom, left, diagonal (all in 4 dirns)");
    }
}

class Rook implements ChessPlayer{
    @Override
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    @Override
    public void moves() {
        System.out.println("up, down, left, right, diagonal (all in 1 step)");
    }
}
