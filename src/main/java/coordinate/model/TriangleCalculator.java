package coordinate.model;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class TriangleCalculator {
    private final Points points;

    public TriangleCalculator(Points points) {
        validate(points);
        this.points = points;
    }


    private void validate(Points points) {
        if (validateXPoints(points) || validateYPoints(points)) {
            throw new IllegalArgumentException("-잘못된 입력입니다.");
        }
    }

    public int TriangleResult() {
        int x1 = points.getXPoint(0);
        int x2 = points.getXPoint(1);
        int x3 = points.getXPoint(2);

        int y1 = points.getYPoint(0);
        int y2 = points.getYPoint(1);
        int y3 = points.getYPoint(2);


        int tmp = (x1 * y2 + x2 * y3 + x3 * y1) - (y1 * x2 + y2 * x3 + y3 * x1);


        int result = Math.abs(tmp) / 2;

        return result;
    }


    private boolean validateXPoints(Points points) {
        return points.getPoints()
                .stream()
                .map(Point::getX)
                .collect(Collectors.toSet())
                .size() == 1;
    }

    private boolean validateYPoints(Points points) {
        return points.getPoints()
                .stream()
                .map(Point::getY)
                .collect(Collectors.toSet())
                .size() == 1;
    }

}
