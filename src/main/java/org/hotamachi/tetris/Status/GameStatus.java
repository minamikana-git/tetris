package org.hotamachi.tetris.Status;

public class GameStatus {
    mport org.hotamachi.tetris.game.Mino;

    public void GameState{


        public void GameManager{}

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
    }


}
