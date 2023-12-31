package org.hotamachi.tetris.game;

public class Mino {
    private BlockType[][] shape; // テトリミノの形状
    private int x, y; // ボード上の位置

    public Mino(BlockType[][] shape) {
        this.shape = shape;
        this.x = 100; // 初期x位置
        this.y = 20;  // 初期y位置
    }

    public enum BlockType {
        EMPTY, // 空のセル
        FILLED // 塗りつぶされたセル
        // 必要に応じて他のタイプを追加
    }



    public BlockType[][] getShape() {
        return shape;
    }

    public void LeftMove() {
        x--; // 左に移動
    }

    public void RightMove() {
        x++; // 右に移動
    }

    public void DownMove() {
        y++; // 下に移動
    }



  public static void rotateTetrimino() { //回転処理の追加

    }
  public void Break(){ //衝突判定

  }
}
