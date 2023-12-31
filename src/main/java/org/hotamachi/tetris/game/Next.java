package org.hotamachi.tetris.game;

import java.awt.*;
import java.util.Random;

import static java.awt.Color.*;
import static org.bukkit.Color.PURPLE;
import static org.hotamachi.tetris.game.Mino.BlockType.EMPTY;

public class Next {
    private Mino currentMino;
    private Mino nextMino;
    private Random random;

    public Next() {
        random = new Random();
        currentMino = generateRandomMino();
        nextMino = generateRandomMino();
    }

    private Mino.BlockType[][] iShape = {

    };
    private Mino.BlockType[][] oShape = {

    };
    private Mino.BlockType[][] sShape = {

    };
    private Mino.BlockType[][] zShape = {

    };
    private Mino.BlockType[][] jShape = {

    };
    private Mino.BlockType[][] lShape = {

    };
    private Mino.BlockType[][] tShape = {

    };



    private enum block {


        private Mino.BlockType[][] iShape = {
                {EMPTY, EMPTY, EMPTY, EMPTY},
                {CYAN, CYAN, CYAN, CYAN},
                {EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY}
        };
        private Color[][] oShape = {
                {YELLOW, YELLOW},
                {YELLOW, YELLOW}
        };
        private Mino.BlockType[][] sShape = {
                {EMPTY, GREEN, GREEN},
                {GREEN, GREEN, EMPTY},
                {EMPTY, EMPTY, EMPTY}
        };
        private Mino.BlockType[][] zShape = {
                {RED, RED, EMPTY},
                {EMPTY, RED, RED},
                {EMPTY, EMPTY, EMPTY}
        };
        private Mino.BlockType[][] jShape = {
                {BLUE, EMPTY, EMPTY},
                {BLUE, BLUE, BLUE},
                {EMPTY, EMPTY, EMPTY}
        };
        private Color[][] lShape = {
                {Mino.BlockType.EMPTY, EMPTY, ORANGE},
                {ORANGE, ORANGE, ORANGE},
                {EMPTY, EMPTY, EMPTY}
        };
        private org.bukkit.Color[][] tShape = {
                {EMPTY, PURPLE, EMPTY},
                {PURPLE, PURPLE, PURPLE},
                {EMPTY, EMPTY, EMPTY}
        };
    }

    private Mino generateRandomMino() {
        Mino.BlockType[][][] shapes = {iShape, oShape, sShape, zShape, jShape, lShape, tShape};
        int index = new Random().nextInt(shapes.length);
        return new Mino(shapes[index]);
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
