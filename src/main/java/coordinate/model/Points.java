package coordinate.model;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Points {
    private final List<Point> points;

    public Points(List<Point> points) {
        this.points = sortPoints(points);
    }

    public int getXPoint(int num) {
        return getPoint(num).getX();
    }

    public int getYPoint(int num) {
        return getPoint(num).getY();
    }

    public List<Point> getPoints() {
        return points;
    }

    private Point getPoint(int num) {
        return points.get(num);
    }

    private List<Point> sortPoints(List<Point> points) {
        return points
                .stream()
                .sorted(Comparator.comparingInt(Point::getY).reversed().thenComparing(Point::getX))
                .collect(Collectors.toList());
    }
}
