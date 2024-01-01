package org.hotamachi.tetris.game;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

public class Mino {
    private BlockType[][] shape;
    private int x, y, z; // ミノのワールド内の座標

    public Mino(BlockType[][] shape, int x, int y, int z) {
        this.shape = shape;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Mino mino = new Mino(shape, x, y, z);

    World world = Bukkit.getWorld("world");

    public Mino(BlockType[][] shape) {
    }

    public void placeInWorld() {
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[i].length; j++) {
                if (shape[i][j] != BlockType.EMPTY) {
                    Block block = world.getBlockAt(x + j, y - i, z);
                    block.setType(getMaterial(shape[i][j]));
                }
            }
        }
    }

    public BlockType[][] getShape() {
        return shape;
    }

    public BlockType[][] getBlocks() {
        return new BlockType[0][];
    }

    public enum BlockType {
        EMPTY, 
        CYAN, 
        YELLOW, 
        GREEN, 
        RED, 
        BLUE, 
        ORANGE, 
        PURPLE 
    }

    private Material getMaterial(BlockType type) {
        switch (type) {
            case CYAN: return Material.CYAN_WOOL;
            case YELLOW: return Material.YELLOW_WOOL;
            case GREEN: return Material.GREEN_WOOL;
            case RED: return Material.RED_WOOL;
            case BLUE: return Material.BLUE_WOOL;
            case ORANGE: return Material.ORANGE_WOOL;
            case PURPLE: return Material.PURPLE_WOOL;
            default: return Material.AIR;
        }
    }
}