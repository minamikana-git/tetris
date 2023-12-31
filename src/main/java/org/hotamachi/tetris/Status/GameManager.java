package org.hotamachi.tetris.Status;

import org.hotamachi.tetris.Tetris;
import org.hotamachi.tetris.game.Mino;


public class GameManager {

    private Mino.BlockType[][] shape;
    private GameState currentState = GameState.WAITING;
    private Tetrimino currentTetrimino;  // add a Tetrimino field to the class

    public GameManager(Tetris tetris) {
    }

    public static GameManager getGame() {
        return null;
    }

    public void startGame() {
        if (currentState == GameState.WAITING) {
            currentState = GameState.IN_GAME;
            currentTetrimino = new Tetrimino();  // instantiate a Tetrimino when the game starts
        }
    }

    public void endGame() {
        currentState = GameState.GAME_OVER;
        currentTetrimino = null;  // clear the Tetrimino when the game ends
    }

    public GameState getCurrentState() {
        return currentState;
    }

    public Tetrimino getCurrentTetrimino() {  // method to check the current Tetrimino
        return currentTetrimino;
    }

    // スコア管理や他のメソッドをここに追加

    public void pauseGame() { // ポーズ
        if (currentState == GameState.IN_GAME) {
            currentState = GameState.WAITING;
        }
    }

    public void rotateTetrimino() {
        int size = shape.length;
        Mino.BlockType[][] newShape = new Mino.BlockType[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                newShape[j][size - 1 - i] = shape[i][j];
            }
        }

        // 衝突判定などのロジックをここに追加

        // 回転を適用
        shape = newShape;
    }
}


}
