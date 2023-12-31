package org.hotamachi.tetris.Status;


import org.hotamachi.tetris.game.Mino;

public enum GameState {
    WAITING,
    IN_GAME,
    GAME_OVER;

    public Mino getCurrentMino() {
        GameManager gameManager = GameManager.getGame();
        if (gameManager != null) {
            return gameManager.getCurrentMino();
        } else {
            return null;
        }
    }
}