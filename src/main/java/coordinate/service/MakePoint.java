package coordinate.service;

import coordinate.model.Point;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MakePoint {

    public Point separatedRegexPoint(String input) {
        Pattern pattern = Pattern.compile("\\(([0-9]{1,2}),([0-9]{1,2})\\)");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return createPoint(matcher.group(1), matcher.group(2));
        }
        throw new IllegalArgumentException("잘못된 입력입니다.");
    }

    private Point createPoint(String x, String y) {
        return new Point(parsingNumber(x), parsingNumber(y));
    }

    private int parsingNumber(String number) {
        return Integer.parseInt(number);
    }
}
