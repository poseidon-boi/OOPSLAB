class Game {
    void type() {
        System.out.println("Indoor & outdoor games");
    }
}

class Cricket extends Game {
    void type() {
        System.out.println("Cricket is an outdoor game");
    }
}

class Chess extends Game {
    void type() {
        System.out.println("Chess is an indoor game");
    }
}

class Gaming {
    public static void main(String[] args) {
        Game game = new Game();
        Game cricket = new Cricket();
        Game chess = new Chess();
        game.type();
        cricket.type();
        chess.type();
    }
}
