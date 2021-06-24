package coordinate.view;

import java.util.Scanner;

public class InputView {
    private static final String INPUTMESSAGE = "좌표를 입력하세요.";
    private final Scanner scanner = new Scanner(System.in);

    public String inputCoordinate() {
        System.out.println(INPUTMESSAGE);
        return scanner.nextLine();
    }


}
