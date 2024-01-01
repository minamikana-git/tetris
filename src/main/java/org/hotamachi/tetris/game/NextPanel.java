package org.hotamachi.tetris.game;

import javax.swing.*;
import java.awt.*;

import static org.hotamachi.tetris.game.Mino.BlockType.*;

public class NextPanel extends JPanel {
    private Mino nextMino;

    public void setNextMino(Mino mino) {
        this.nextMino = mino;
        repaint(); // パネルの再描画を要求
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (nextMino != null) {
            drawMino(g, nextMino);
        }
    }

    private void drawMino(Graphics g, Mino mino) {
        Mino.BlockType[][] shape = mino.getShape();
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[i].length; j++) {
                if (shape[i][j] != Mino.BlockType.EMPTY) {
                    g.setColor(getColor(shape[i][j]));
                    g.fillRect(j * 20, i * 20, 20, 20); // サイズや位置は適宜調整
                }
            }
        }
    }

    private Color getColor(Mino.BlockType type) {
        switch (type) {
            case CYAN: return Color.CYAN;
            case YELLOW: return Color.YELLOW;
            case GREEN: return Color.GREEN;
            case RED: return Color.RED;
            case BLUE: return Color.BLUE;
            case ORANGE: return Color.ORANGE;
            case PURPLE: return Color.MAGENTA; // 紫色をMAGENTAで代用
            default: return Color.BLACK;
        }
    }
}
