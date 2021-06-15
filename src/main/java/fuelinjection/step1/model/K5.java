package fuelinjection.step1.model;

public class K5 extends Car {
    private final String NAME = "K5";
    private final double DISTANCEPERLITER = 13;
    private final int distance;

    public K5(int distance) {
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
