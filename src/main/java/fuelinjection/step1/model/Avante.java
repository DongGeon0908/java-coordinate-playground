package fuelinjection.step1.model;

public class Avante extends Car {
    private final String NAME = "Avante";
    private final double DISTANCEPERLITER = 15;
    private final int distance;

    public Avante(int distance) {
        this.distance = distance;
    }


    @Override
    double getDistancePerLiter() {
        return DISTANCEPERLITER;
    }

    @Override
    double getTripDistance() {
        return this.distance;
    }

    @Override
    String getName() {
        return NAME;
    }
}
