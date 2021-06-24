package coordinate.model;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        checkRange(x, y);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    private void checkRange(int x, int y) {
        if (checkRange(x) || checkRange(y)) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    private boolean checkRange(int input) {
        return input < 0 || input > 24;
    }
}
