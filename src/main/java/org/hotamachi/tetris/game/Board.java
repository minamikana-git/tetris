package org.hotamachi.tetris.game;

import java.util.Arrays;


public class Board {
    private Mino.BlockType[][] grid;
    private int width, height;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        grid = new Mino.BlockType[height][width];
        // 初期化処理（すべてのセルを EMPTY に設定）
        for (int i = 0; i < height; i++) {
            Arrays.fill(grid[i], Mino.BlockType.EMPTY);
        }
    }

    // ライン消去処理
    public void checkAndClearLines() {
        for (int y = 0; y < height; y++) {
            if (isLineFull(y)) {
                clearLine(y);
                shiftDown(y);
            }
        }
    }

    private boolean isLineFull(int y) {
        for (int x = 0; x < width; x++) {
            if (grid[y][x] == Mino.BlockType.EMPTY) {
                return false;
            }
        }
        return true;
    }

    private void clearLine(int y) {
        Arrays.fill(grid[y], Mino.BlockType.EMPTY);
    }

    private void shiftDown(int clearedLine) {
        for (int y = clearedLine; y > 0; y--) {
            System.arraycopy(grid[y - 1], 0, grid[y], 0, width);
        }
        Arrays.fill(grid[0], Mino.BlockType.EMPTY); // 一番上の行を空にする
    }
}
