public class Player {
    private String name;
    private String identifier;

    public Player (String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public static boolean mark(int x , int y) {
        int row = x;
        int col = y;
        if (!Game.validation(row, col)) {
            System.out.println("Not a valid move( out of index ) !! try again");
            return false;
        } else {
            if (Game.checkMarked(row, col)) {
                System.out.println("location already marked !! try a different location");
                return false;
            } else {
                if (Game.getTurn().equals(Game.X)) {
                    Game.board[row][col] = Game.X;
                    Game.printBoard();
                    Game.setTurn(Game.O);
                    return true;
                }
                else if (Game.getTurn().equals(Game.O)) {
                    Game.board[row][col] = Game.O;
                    Game.printBoard();
                    Game.setTurn(Game.X);
                    return true;
                }
            }
        }
        return false;
    }
}
