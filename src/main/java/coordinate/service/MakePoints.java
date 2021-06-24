package coordinate.service;

import coordinate.model.Point;
import coordinate.model.Points;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MakePoints {
    private final MakePoint makePoint;
    private final Points points;

    public MakePoints(String input) {
        this.makePoint = new MakePoint();
        this.points = makePoints(input);
    }

    public Points getPoints() {
        return this.points;
    }

    private Points makePoints(String input) {
        //checkPointsSize(inputData);

        List<Point> points = splitPoints(input)
                .stream()
                .map(makePoint::separatedRegexPoint)
                .collect(Collectors.toList());

        return new Points(points);
    }

    private List<String> splitPoints(String input) {
        return Arrays.asList(input.split("-"));
    }



    /*
    private void checkPointsSize(List<String> input) {
        if (input.size() != 2) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }
     */
}
