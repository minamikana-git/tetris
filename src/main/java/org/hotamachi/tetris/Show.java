package org.hotamachi.tetris;

import org.bukkit.World;
import org.bukkit.Material;
import org.hotamachi.tetris.game.Mino;

public class Show {

        private World world;
        private int startX, startY, startZ; // テトリス盤の開始位置

    public Show(World world, int startX, int startY, int startZ) {
        this.world = world;
        this.startX = 100;
        this.startY = 20;
        this.startZ = startZ;
    }
        public void displayTetrimino(Mino mino) {
            // テトリミノのブロックを配置
            Mino.BlockType[][] shape = mino.getShape();
            for (int i = 0; i < shape.length; i++) {
                for (int j = 0; j < shape[i].length; j++) {
                    if (shape[i][j] != Mino.BlockType.EMPTY) {
                        world.getBlockAt(startX + j, startY + i, startZ).setType(Material.LIGHT_BLUE_WOOL); // 例: WOOLブロックを使用
                    }
                }
            }
        }

        // 必要に応じてブロックを削除するメソッドも追加
    }



