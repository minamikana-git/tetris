package org.hotamachi.tetris.game;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

public class ScoreboardManager {
    private Scoreboard scoreboard;
    private Objective objective;

    public ScoreboardManager() {
        org.bukkit.scoreboard.ScoreboardManager manager = Bukkit.getScoreboardManager();
        scoreboard = manager.getNewScoreboard();
        objective = scoreboard.registerNewObjective("Score", "dummy", "Score");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
    }

    public void updateScore(int score) {
        Score scoreEntry = objective.getScore("Lines Cleared:");
        scoreEntry.setScore(score);
    }

    public void showToPlayer(Player player) {
        player.setScoreboard(scoreboard);
    }
}
