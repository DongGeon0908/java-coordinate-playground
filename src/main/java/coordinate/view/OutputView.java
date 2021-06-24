package coordinate.view;

import coordinate.model.Point;
import coordinate.model.Points;

public class OutputView {

    public void lineResultOutput(double result) {
        String length = String.format("%.6f", result);
        System.out.println("두 점 사이 거리는 " + length);
    }

    public void squareResultOutput(int result) {
        System.out.println("사각형 넓이는 " + result);
    }

    public void lineCoordinate(Points points) {
        for (int y = 24; y > 0; y--) {

            if (y % 2 == 0 && y >= 10) {
                System.out.print(y);
                System.out.print("|");
            }

            if (y % 2 == 0 && y < 10) {
                System.out.print(" ");
                System.out.print(y);
                System.out.print("|");
            }

            if (y % 2 != 0 && y != 0) {
                System.out.print(" ");
                System.out.print(" ");
                System.out.print("|");
            }


            for (int x = 0; x <= 24; x++) {
                for (Point point : points.getPoints()) {
                    if (point.getX() == x && point.getY() == y) {

                        for (int i = 0; i < x; i++) {
                            System.out.print("  ");
                        }
                        System.out.print("    ");
                        System.out.print(".");
                    }
                }
            }
            System.out.println();

        }
        System.out.print("  ");
        System.out.print("+");
        for (int x = 0; x <= 24; x++) {
            if (x >= 10) {
                System.out.print("--");
                continue;
            }

            System.out.print("---");
        }
        System.out.println();
        xCoordinate();
        System.out.println();
    }

    public void xCoordinate() {
        System.out.print(" ");
        for (int i = 0; i <= 24; i++) {
            if (i % 2 == 0 && i >= 10) {
                System.out.print(i);
                System.out.print("   ");
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i);
                System.out.print("    ");
                continue;
            }

        }
    }
}
