package org.hotamachi.tetris.Status;

public class Tetrimino {
    private int[][] shape;
    private int rotationState;

    public Tetrimino() {
        this.shape = shape;
        this.rotationState = 0;
    }

    public void rotate() {
        int size = this.shape.length;
        int[][] tempShape = new int[size][size];

        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                tempShape[j][size-1-i] = this.shape[i][j];
            }
        }

        this.shape = tempShape;
        this.rotationState = (this.rotationState + 1) % 4;
    }
    public int[][] getShape() {
        return shape;
    }

    public void setShape(int[][] newShape) {
        this.shape = newShape;
    }

}