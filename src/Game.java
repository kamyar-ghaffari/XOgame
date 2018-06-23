public class Game {
    private static int rows = 3;
    private static int cols = 3;
    public static String X = " X ";
    public static String O = " O ";
    private static String empty = "   ";
    public static String[][] board = new String[rows][cols];
    private static String turn;
    private static String status;


    public static void Status() {
        if (board[0][0].equals(X) && board[0][1].equals(X) && board[0][2].equals(X)
            || board[1][0].equals(X) && board[1][1].equals(X) && board[1][2].equals(X)
            || board[2][0].equals(X) && board[2][1].equals(X) && board[2][2].equals(X)
            || board[0][0].equals(X) && board[1][0].equals(X) && board[2][0].equals(X)
            || board[0][1].equals(X) && board[1][1].equals(X) && board[2][1].equals(X)
            || board[0][2].equals(X) && board[1][2].equals(X) && board[2][2].equals(X)
            || board[0][0].equals(X) && board[1][1].equals(X) && board[2][2].equals(X)
            || board[0][2].equals(X) && board[1][1].equals(X) && board[2][0].equals(X)) {
            setStatus("X WON");
            System.out.println(Main.player_x.getName() + " WON !!");
        } else if (board[0][0].equals(O) && board[0][1].equals(O) && board[0][2].equals(O)
                || board[1][0].equals(O) && board[1][1].equals(O) && board[1][2].equals(O)
                || board[2][0].equals(O) && board[2][1].equals(O) && board[2][2].equals(O)
                || board[0][0].equals(O) && board[1][0].equals(O) && board[2][0].equals(O)
                || board[0][1].equals(O) && board[1][1].equals(O) && board[2][1].equals(O)
                || board[0][2].equals(O) && board[1][2].equals(O) && board[2][2].equals(O)
                || board[0][0].equals(O) && board[1][1].equals(O) && board[2][2].equals(O)
                || board[0][2].equals(O) && board[1][1].equals(O) && board[2][0].equals(O)) {
            setStatus("O WON");
            System.out.println(Main.player_o.getName() + " WON !!");
        } else if (!board[0][0].equals(empty) && !board[0][1].equals(empty) && !board[0][2].equals(empty)
                && !board[1][0].equals(empty) && !board[1][1].equals(empty) && !board[1][2].equals(empty)
                && !board[2][0].equals(empty) && !board[2][1].equals(empty) && !board[2][2].equals(empty)) {
            setStatus("DRAW");
            System.out.println("It's a DRAW !!");
        } else {
        setStatus("PLAYING");
        }
    }

    public static String getTurn() {
        return turn;
    }

    public static void setTurn(String turn) {
        Game.turn = turn;
    }

    public static String getStatus() {
        return status;
    }

    private static void setStatus(String status) {
        Game.status = status;
    }

    public static void start(){
        for (int row = 0; row < rows; ++row) {
            for (int col = 0; col < cols; ++col) {
                board[row][col] = empty;
            }
        }
        setTurn(X);
        printBoard();

    }

    static boolean validation(int row, int col) {
        if (row > 2 || row < 0 || col > 2 || col < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printBoard() {
        System.out.println("    1   2   3   ");
        System.out.println("  ------------- ");
        System.out.println("1 " + "|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
        System.out.println("  ------------- ");
        System.out.println("2 " + "|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
        System.out.println("  ------------- ");
        System.out.println("3 " + "|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
        System.out.println("  ------------- ");
    }

    static boolean checkMarked(int x, int y) {
        if (board[x][y].equals(X) || board[x][y].equals(O)){
            return true;
        } else {
            return false;
        }
    }
}
