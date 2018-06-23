import java.util.Scanner;

public class Runner {
    private static Scanner name = new Scanner(System.in);
    private static Scanner input = new Scanner(System.in);
    private static Scanner again = new Scanner(System.in);

    public static String getPlayer_x_name() {
        return player_x.getName();
    }

    public static String getPlayer_o_name() {
        return player_o.getName();
    }

    private static Player player_x = null;
    private static Player player_o = null;

    public static void run() {
        player_x = null;
        player_o = null;
        System.out.println("Player X , please enter your name:");
        String player_1_name = name.nextLine();
        System.out.println("player O , please enter your name:");
        String player_2_name = name.nextLine();
        player_x = new Player(player_1_name, "X");
        player_o = new Player(player_2_name, "O");

        Game.start();
        do {
            if (Game.getTurn().equals(Game.X)) {
                System.out.println(player_x.getName() + " please enter your move. (example: 1 3)");
                int row = input.nextInt() - 1;
                int col = input.nextInt() - 1;
                Player.mark(row, col);
                Game.Status();
            } else if (Game.getTurn().equals(Game.O)) {
                System.out.println(player_o.getName() + " please enter your move. (example: 2 1)");
                int row = input.nextInt() - 1;
                int col = input.nextInt() - 1;
                Player.mark(row, col);
                Game.Status();
            }
        } while (Game.getStatus().equals("PLAYING"));
    }
    static void reRun(){
        System.out.println("wanna play again? (y/n)");
        String answer = again.nextLine();
        if (answer.equals("y") || answer.equals("Y")) {
            run();
        } else if (answer.equals("n") || answer.equals("N")) {
            System.exit(0);
        } else {
            reRun();
        }
    }
}
