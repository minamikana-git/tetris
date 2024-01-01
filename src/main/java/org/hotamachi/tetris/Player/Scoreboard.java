package org.hotamachi.tetris.Player;

import org.bukkit.entity.Player;
import org.hotamachi.tetris.game.ScoreboardManager;

public class Scoreboard {
    private int score;

    Player player;
    private ScoreboardManager scoreboardManager;

    public Scoreboard() {
        score = 0;
        scoreboardManager = new ScoreboardManager();
    }

    public void addScore(int linesCleared) {
        if (linesCleared > 0) {
            // スコアの計算
            // ...
            // スコアボードの更新
            scoreboardManager.updateScore(score);
            scoreboardManager.showToPlayer(player);
        }
    }

    public int getScore() {
        return score;
    }
}
