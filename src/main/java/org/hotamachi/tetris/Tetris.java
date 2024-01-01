package org.hotamachi.tetris;

import org.bukkit.plugin.java.JavaPlugin;
import org.hotamachi.tetris.Status.GameManager;
import org.hotamachi.tetris.game.ScoreboardManager;
import org.hotamachi.tetris.game.TetrisInputListener;

public class Tetris extends JavaPlugin { //メインクラス
    private ScoreboardManager scoreboardManager;
    private GameManager gameManager;

    @Override
    public void onEnable() {
        scoreboardManager = new ScoreboardManager();
        gameManager = new GameManager(this);
        getServer().getPluginManager().registerEvents(new TetrisInputListener(gameManager), this);
        // 他の初期化処理（イベントリスナーの登録など）



    }
    public ScoreboardManager getScoreboardManager() {
        return scoreboardManager;
    }


    public GameManager getGameManager() {
        return gameManager;
    }


    @Override
    public void onDisable() {
        // 必要なクリーンアップ処理

    }
}
