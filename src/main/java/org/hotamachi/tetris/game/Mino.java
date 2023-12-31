package org.hotamachi.tetris.game;

public class Mino {

    private BlockType[][] shape;
    private int x, y; // ボード上の位置

    public Mino(BlockType[][] shape) {
        this.shape = shape;
        this.x = 100;
        this.y = 20;
    }

    public static BlockType[][] getShape() {
        return new BlockType[0][];
    }

    // テトリミノを動かすメソッド（左、右、下、回転など）
    // 衝突判定などのロジックをここに追加
  public void Leftmove() { //左移動

  }
  public void Rightmove(){ //右移動

    }
  public void Downmove(){ //下移動

  }



  public static void rotateTetrimino() { //回転処理の追加

    }
  public void Break(){ //衝突判定

  }
}
