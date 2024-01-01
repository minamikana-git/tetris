package org.hotamachi.tetris.Status;

import org.hotamachi.tetris.game.Mino;

public class Tetrimino {
    private Mino.BlockType[][] shape;
    private int rotationState;

    public Tetrimino() {
        this.shape = shape;
        this.rotationState = 0; // 初期の回転状態を0に設定
    }

    public void rotate() {
        int size = this.shape.length;
        Mino.BlockType[][] tempShape = new Mino.BlockType[size][size];

        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                tempShape[j][size-1-i] = this.shape[i][j];
            }
        }

        this.shape = tempShape;
        this.rotationState = (this.rotationState + 90) % 360; // 回転状態を更新
    }

    public Mino.BlockType[][] getShape() {
        return shape;
    }

    public void setShape(Mino.BlockType[][] newShape) {
        this.shape = newShape;
    }
}
