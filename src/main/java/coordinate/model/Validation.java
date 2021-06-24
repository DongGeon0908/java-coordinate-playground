package coordinate.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validation {

    public Validation(String input) {
        isCorrectPattern(input);
    }

    private void isCorrectPattern(String input) {
        Pattern pattern = Pattern.compile("(\\([0-9]{1,2},[0-9]{1,2}\\))(-(\\([0-9]{1,2},[0-9]{1,2}\\))){0,3}");
        Matcher matcher = pattern.matcher(input);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

}
