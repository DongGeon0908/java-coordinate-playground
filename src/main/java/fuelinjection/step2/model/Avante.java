package fuelinjection.step2.model;


public class Avante implements Car {
    private final String NAME = "Avante";
    private final double DISTANCEPERLITER = 15;
    private final int distance;

    public Avante(int distance) {
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
