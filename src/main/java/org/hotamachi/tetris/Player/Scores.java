package org.hotamachi.tetris.Player;

public class Scores {
    private int score;

    public void Scoreboard() {
        score = 0;
    }

    public void addScore(int linesCleared) {
        if (linesCleared > 0) {
            // 例: 1行につき100点、2行で300点、3行で500点、4行で800点
            switch (linesCleared) {
                case 1: score += 100; break;
                case 2: score += 300; break;
                case 3: score += 500; break;
                case 4: score += 800; break;
                default: break; // 5行以上の場合は特別な処理（通常は発生しない）
            }
        }
    }

    public int getScore() {
        return score;
    }
}

