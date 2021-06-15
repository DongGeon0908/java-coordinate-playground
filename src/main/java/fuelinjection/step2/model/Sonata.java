package fuelinjection.step2.model;


public class Sonata implements Car {
    private final String NAME = "Sonata";
    private final double DISTANCEPERLITER = 10;
    private final int distance;

    public Sonata(int distance) {
        this.distance = distance;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getChargeQuantity() {
        return this.distance / DISTANCEPERLITER;
    }
}
