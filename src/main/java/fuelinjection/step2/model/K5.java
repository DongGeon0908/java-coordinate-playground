package fuelinjection.step2.model;


public class K5 implements Car {
    private final String NAME = "K5";
    private final double DISTANCEPERLITER = 13;
    private final int distance;

    public K5(int distance) {
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
