package org.hotamachi.tetris.Status;

import org.hotamachi.tetris.Tetris;
import org.hotamachi.tetris.game.Mino;

public class GameManager {
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

    public void rotateTetrimino() { //回転処理の追加
        if (currentTetrimino != null) {  // only rotate if there is a Tetrimino
            currentTetrimino.rotate();  // call the rotate method of the Tetrimino
        }
    }

    public Mino getCurrentMino() {
        return null;
    }
}