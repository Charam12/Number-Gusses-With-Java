public class Scoreboard {
    private int highScore = 0;

    public void add_score(int score) {
        if (score > highScore) {
            highScore = score;
        }
    }

    public int get_high_score() {
        return highScore;
    }
}
