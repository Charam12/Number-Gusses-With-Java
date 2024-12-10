import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);
        Scoreboard scoreboard = new Scoreboard();
        Game game = new Game(player);

        System.out.println("Welcome to the game, " + player.get_name() + "!");
        
        System.out.println("Choose difficulty: 1 (easy), 2 (medium), 3 (hard)");
        int difficulty = scanner.nextInt();
        game.set_difficulty(difficulty);
        
        boolean playAgain = true;
        while (playAgain) {
            System.out.println("Guess the number: ");
            int userGuess = scanner.nextInt();

            if (game.check_guess(userGuess)) {
                System.out.println("Correct guess! You've earned 100 points.");
                scoreboard.add_score(100);
            } else {
                System.out.println("Incorrect guess. Try again.");
            }
            
            System.out.println("High Score: " + scoreboard.get_high_score());

            System.out.println("Do you want to play again? (yes/no)");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                playAgain = false;
            }
        }
        System.out.println("Thanks for playing! Final High Score: " + scoreboard.get_high_score());
    }
}
