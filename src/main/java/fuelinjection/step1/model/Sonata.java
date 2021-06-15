package fuelinjection.step1.model;

public class Sonata extends Car {
    private final String NAME = "Sonata";
    private final double DISTANCEPERLITER = 10;
    private final int distance;

    public Sonata(int distance) {
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
