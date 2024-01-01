package org.hotamachi.tetris.game;

public class Mino {
    private BlockType[][] shape; // テトリミノの形状
    private int x, y; // ボード上の位置

    public Mino(BlockType[][] shape) {
        this.shape = shape;
        this.x = 100; // 初期x位置
        this.y = 20;  // 初期y位置
    }

    // Enum BlockTypeの修正
    public enum BlockType {
        EMPTY, // 空のセル
        FILLED, // 塗りつぶされたセル
        CYAN, // 水色
        YELLOW, // 黄色
        GREEN, // 緑
        RED, // 赤
        BLUE, // 青
        ORANGE, // オレンジ
        PURPLE // 紫
        // ... 他の色やブロックタイプ
    }

    // テトリミノの形状を取得
    public BlockType[][] getShape() {
        return shape;
    }

    // 左に移動
    public void leftMove() {
        x--;
    }

    // 右に移動
    public void rightMove() {
        x++;
    }

    // 下に移動
    public void downMove() {
        y++;
    }

    // テトリミノの回転
    public void rotateTetrimino() {
        int size = shape.length;
        BlockType[][] newShape = new BlockType[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                newShape[j][size - 1 - i] = shape[i][j];
            }
        }

        // 回転を適用
        shape = newShape;
    }
}
