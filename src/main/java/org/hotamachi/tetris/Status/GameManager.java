package org.hotamachi.tetris.Status;

import org.hotamachi.tetris.Player.Scoreboard;
import org.hotamachi.tetris.Tetris;
import org.hotamachi.tetris.game.Mino;


public class GameManager {
    private static GameManager gameManagerInstance = null;
    private Mino.BlockType[][] shape;
    private GameState currentState = GameState.WAITING;
    private Tetrimino currentTetrimino;  // 現在のテトリミノ

    private Scoreboard scoreboard;

    public enum GameState {
        WAITING, // ゲーム待機中
        IN_GAME, // ゲームプレイ中
        GAME_OVER // ゲームオーバー
    }

    public GameManager(Tetris tetris) {
        scoreboard = new Scoreboard();
        // 他の初期化処理
    }

    public void lineCleared(int lines) {
        scoreboard.addScore(lines);
        // ライン消去時の他の処理
    }

    public static GameManager getGame() {
        if (gameManagerInstance == null) {
            gameManagerInstance = new GameManager(new Tetris());
        }
        return gameManagerInstance;
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


    public void pauseGame() { // ポーズ
        if (currentState == GameState.IN_GAME) {
            currentState = GameState.WAITING;
        }
    }

    public void rotateTetrimino() {
        if (currentTetrimino != null) {
            Mino.BlockType[][] shape = currentTetrimino.getShape();
            int size = shape.length;
            Mino.BlockType[][] newShape = new Mino.BlockType[size][size];

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    newShape[j][size - 1 - i] = shape[i][j];
                }
            }

            // 回転を適用
            currentTetrimino.setShape(newShape);
        }
    }
}



