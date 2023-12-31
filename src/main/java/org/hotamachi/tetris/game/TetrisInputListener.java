package org.hotamachi.tetris.game;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.hotamachi.tetris.Status.GameManager;

import static org.hotamachi.tetris.game.Mino.rotateTetrimino;

public class TetrisInputListener implements Listener {
    private GameManager gameManager;

    public TetrisInputListener(GameManager gameManager) {
        this.gameManager = gameManager;
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        // プレイヤーのアクションに応じてテトリミノを動かす
        // 例: 右クリックでテトリミノを回転
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            rotateTetrimino();
        }


        //左回転（左クリック（
        if (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK) {
            rotateTetrimino();

        }
    }
}

