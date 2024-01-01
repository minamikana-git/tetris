package org.hotamachi.tetris.game;


import java.util.Random;

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
                // I-テトリミノ
                {
                        {Mino.BlockType.EMPTY, Mino.BlockType.EMPTY, Mino.BlockType.EMPTY, Mino.BlockType.EMPTY},
                        {Mino.BlockType.CYAN, Mino.BlockType.CYAN, Mino.BlockType.CYAN, Mino.BlockType.CYAN},
                        {Mino.BlockType.EMPTY, Mino.BlockType.EMPTY, Mino.BlockType.EMPTY, Mino.BlockType.EMPTY},
                        {Mino.BlockType.EMPTY, Mino.BlockType.EMPTY, Mino.BlockType.EMPTY, Mino.BlockType.EMPTY}
                },
                // O-テトリミノ
                {
                        {Mino.BlockType.YELLOW, Mino.BlockType.YELLOW},
                        {Mino.BlockType.YELLOW, Mino.BlockType.YELLOW}
                },
                // S-テトリミノ
                {
                        {Mino.BlockType.EMPTY, Mino.BlockType.GREEN, Mino.BlockType.GREEN},
                        {Mino.BlockType.GREEN, Mino.BlockType.GREEN, Mino.BlockType.EMPTY},
                        {Mino.BlockType.EMPTY, Mino.BlockType.EMPTY, Mino.BlockType.EMPTY}
                },
                // Z-テトリミノ
                {
                        {Mino.BlockType.RED, Mino.BlockType.RED, Mino.BlockType.EMPTY},
                        {Mino.BlockType.EMPTY, Mino.BlockType.RED, Mino.BlockType.RED},
                        {Mino.BlockType.EMPTY, Mino.BlockType.EMPTY, Mino.BlockType.EMPTY}
                },
                // J-テトリミノ
                {
                        {Mino.BlockType.BLUE, Mino.BlockType.EMPTY, Mino.BlockType.EMPTY},
                        {Mino.BlockType.BLUE, Mino.BlockType.BLUE, Mino.BlockType.BLUE},
                        {Mino.BlockType.EMPTY, Mino.BlockType.EMPTY, Mino.BlockType.EMPTY}
                },
                // L-テトリミノ
                {
                        {Mino.BlockType.ORANGE, Mino.BlockType.ORANGE, Mino.BlockType.ORANGE},
                        {Mino.BlockType.ORANGE, Mino.BlockType.EMPTY, Mino.BlockType.EMPTY},
                        {Mino.BlockType.EMPTY, Mino.BlockType.EMPTY, Mino.BlockType.EMPTY}
                },
                // T-テトリミノ
                {
                        {Mino.BlockType.EMPTY, Mino.BlockType.PURPLE, Mino.BlockType.EMPTY},
                        {Mino.BlockType.PURPLE, Mino.BlockType.PURPLE, Mino.BlockType.PURPLE},
                        {Mino.BlockType.EMPTY, Mino.BlockType.EMPTY, Mino.BlockType.EMPTY}
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
