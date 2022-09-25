package tictactoe;

public class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "[" + (x+1) + ", " + (y+1) + "]";
    }
}