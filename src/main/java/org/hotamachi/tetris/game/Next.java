package org.hotamachi.tetris.game;

import java.util.Random;

public class Next {
    private Mino currentMino;
    private Mino nextMino;
    private Random random;

    public TetrisGame() {
        random = new Random();
        currentMino = generateRandomMino();
        nextMino = generateRandomMino();
    }

    private Mino generateRandomMino() {
        // ランダムにテトリミノを生成
        Mino.BlockType[][] shape = generateRandomMino(this); // ランダムに形状を選択
        return new Mino(shape);
    }

    public void nextTurn() {
        // 現在のミノをボードに固定する処理

        // 次のミノを現在のミノに設定
        currentMino = nextMino;
        nextMino = generateRandomMino();

        // Next表示エリアにnextMinoを表示
        displayNextMino();
    }

    private void displayNextMino() {
        // NextエリアにnextMinoを表示する処理
    }
}
