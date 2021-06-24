package coordinate.model;

public class LineCalculator {

    private final Points points;

    public LineCalculator(Points points) {
        this.points = points;
    }

    public double lineLengthResult() {

        int x1 = points.getXPoint(0);
        int y1 = points.getYPoint(0);

        int x2 = points.getXPoint(1);
        int y2 = points.getYPoint(1);

        return sqrtNumber(powNumber(x1, x2), powNumber(y1, y2));
    }

    private double sqrtNumber(double num1, double num2) {
        return Math.sqrt(num1 + num2);
    }

    private double powNumber(int num1, int num2) {
        return Math.pow(num1 - num2, 2);
    }
}
