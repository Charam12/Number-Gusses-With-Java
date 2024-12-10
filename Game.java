import java.util.Random;

public class Game {
    private Scoreboard scoreboard;
    private Player player;
    private int secret_number;
    private int difficulty;
    private Random random;

    public Game(Player player) {
        this.player = player;
        this.scoreboard = new Scoreboard();
        this.random = new Random();
    }

    public void set_difficulty(int level) {
        this.difficulty = level;
        if (level == 1) {
            secret_number = random.nextInt(10) + 1;
        } else if (level == 2) {
            secret_number = random.nextInt(50) + 1;
        } else {
            secret_number = random.nextInt(100) + 1;
        }
    }

    public boolean check_guess(int user_guess) {
        if (user_guess == secret_number) {
            scoreboard.add_score(100);
            return true;
        }
        return false;
    }
}
