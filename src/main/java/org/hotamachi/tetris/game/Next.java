package org.hotamachi.tetris.game;

import java.awt.*;
import java.util.Random;

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

    private void initializeShapes() {
        shapes = new Mino.BlockType[][][]{
                {
                        {EMPTY, EMPTY, EMPTY, EMPTY},
                        {CYAN, CYAN, CYAN, CYAN},
                        {EMPTY, EMPTY, EMPTY, EMPTY},
                        {EMPTY, EMPTY, EMPTY, EMPTY}
                },
                {
                        {YELLOW, YELLOW},
                        {YELLOW, YELLOW}
                },
                shapes = new Mino.BlockType[][][]{
                        {
                                {EMPTY, GREEN, GREEN},
                                {GREEN, GREEN, EMPTY},
                                {EMPTY, EMPTY, EMPTY}
                        },
                        {
                                {RED, RED, EMPTY},
                                {EMPTY, RED, RED}
                        },
                        shapes = new Mino.BlockType[][][]{
                                {
                                        {BLUE, EMPTY, EMPTY},
                                        {BLUE, BLUE, BLUE},
                                        {EMPTY, EMPTY, EMPTY}
                                },
                                shapes = new Mino.BlockType[][][]{

                                        {ORANGE, ORANGE, ORANGE},
                                        {ORANGE, EMPTY, EMPTY}
                                },
                                shapes = new Mino.BlockType[][][]{

                                        {{EMPTY, PURPLE, EMPTY},
                                                {PURPLE, PURPLE, PURPLE},
                                                {EMPTY, EMPTY, EMPTY},
                                        }

                                }
                        }
                }
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
