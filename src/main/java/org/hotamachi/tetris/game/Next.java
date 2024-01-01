package org.hotamachi.tetris.game;


import java.util.Random;

import static java.awt.Color.*;
import static org.hotamachi.tetris.game.Mino.BlockType.*;

public class Next {
    private Mino currentMino;
    private Mino nextMino;
    private Random random;
    private Mino.BlockType[][][] shapes;

    public Next() {
        random = new Random();
        initializeShapes();
        currentMino = generateRandomMino();
        nextMino = generateRandomMino();
    }

    public enum BlockType {
        EMPTY, // 空のブロック
        CYAN, // 水色のブロック
        YELLOW, // 黄色のブロック
        GREEN, // 緑のブロック
        RED, // 赤のブロック
        BLUE, // 青のブロック
        ORANGE, // オレンジのブロック
        PURPLE // 紫のブロック
        // ... 他の色やブロックタイプ
    }


    private void initializeShapes() {
        shapes = new Mino.BlockType[][][]{
                // I-テトリミノ
                {
                        {Mino.BlockType.EMPTY, EMPTY, EMPTY, EMPTY},
                        {Mino.BlockType.CYAN, Mino.BlockType.CYAN, Mino.BlockType.CYAN, Mino.BlockType.CYAN},
                        {Mino.BlockType.EMPTY, EMPTY, EMPTY, EMPTY},
                        {Mino.BlockType.EMPTY, EMPTY, EMPTY, EMPTY}
                },
                // O-テトリミノ
                {
                        {Mino.BlockType.YELLOW, Mino.BlockType.YELLOW},
                        {Mino.BlockType.YELLOW, Mino.BlockType.YELLOW}
                },
                // S-テトリミノ
                {
                        {Mino.BlockType.EMPTY, Mino.BlockType.GREEN, Mino.BlockType.GREEN},
                        {Mino.BlockType.GREEN, Mino.BlockType.GREEN, EMPTY},
                        {Mino.BlockType.EMPTY, EMPTY, EMPTY}
                },
                // Z-テトリミノ
                {
                        {Mino.BlockType.RED, Mino.BlockType.RED, EMPTY},
                        {Mino.BlockType.EMPTY, Mino.BlockType.RED, Mino.BlockType.RED},
                        {Mino.BlockType.EMPTY, EMPTY, EMPTY}
                },
                // J-テトリミノ
                {
                        {Mino.BlockType.BLUE, EMPTY, EMPTY},
                        {Mino.BlockType.BLUE, Mino.BlockType.BLUE, Mino.BlockType.BLUE},
                        {Mino.BlockType.EMPTY, EMPTY, EMPTY}
                },
                // L-テトリミノ
                {
                        {Mino.BlockType.ORANGE, Mino.BlockType.ORANGE, Mino.BlockType.ORANGE},
                        {Mino.BlockType.ORANGE, EMPTY, EMPTY},
                        {Mino.BlockType.EMPTY, EMPTY, EMPTY}
                },
                // T-テトリミノ
                {
                        {Mino.BlockType.EMPTY, Mino.BlockType.PURPLE, EMPTY},
                        {Mino.BlockType.PURPLE, Mino.BlockType.PURPLE, Mino.BlockType.PURPLE},
                        {Mino.BlockType.EMPTY, EMPTY, EMPTY}
                }
        };
    }
















    private Mino generateRandomMino() {
        int index = random.nextInt(shapes.length);
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
