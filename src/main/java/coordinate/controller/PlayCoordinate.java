package coordinate.controller;

import coordinate.model.LineCalculator;
import coordinate.model.Points;
import coordinate.model.TriangleCalculator;
import coordinate.model.Validation;
import coordinate.service.MakePoint;
import coordinate.service.MakePoints;
import coordinate.view.InputView;
import coordinate.view.OutputView;

public class PlayCoordinate {

    private final InputView inputView;
    private final OutputView outputView;

    public PlayCoordinate() {
        inputView = new InputView();
        outputView = new OutputView();
    }

    public void play() {
        while (true) {
            String input = inputView.inputCoordinate();

            try {
                new Validation(input);
                MakePoints makePoints = new MakePoints(input);

                if (makePoints.getPoints().getPoints().size() == 2) {
                    LineCalculator line = new LineCalculator(makePoints.getPoints());
                    outputView.lineCoordinate(makePoints.getPoints());
                    outputView.lineResultOutput(line.lineLengthResult());
                } else if (makePoints.getPoints().getPoints().size() == 3) {
                    TriangleCalculator triangleCalculator = new TriangleCalculator(makePoints.getPoints());
                    outputView.lineCoordinate(makePoints.getPoints());
                    outputView.lineResultOutput(triangleCalculator.TriangleResult());
                } else if (makePoints.getPoints().getPoints().size() == 4) {

                }


            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

        }
    }
}
