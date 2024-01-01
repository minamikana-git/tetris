package org.hotamachi.tetris;

import org.bukkit.plugin.java.JavaPlugin;
import org.hotamachi.tetris.Status.GameManager;
import org.hotamachi.tetris.game.ScoreboardManager;
import org.hotamachi.tetris.game.TetrisInputListener;

public class Tetris extends JavaPlugin { //メインクラス
    private GameManager gameManager;
    private ScoreboardManager scoreboardManager;
    @Override
    public void onEnable() {
        gameManager = new GameManager(this);

        getServer().getPluginManager().registerEvents(new TetrisInputListener(gameManager), this);

        scoreboardManager = new ScoreboardManager();
        // 他の初期化処理（イベントリスナーの登録など）

    }

    @Override
    public void onDisable() {
        // 必要なクリーンアップ処理

    }

    public GameManager getGameManager() {
        return gameManager;
    }
}
