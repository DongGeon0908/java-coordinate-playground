package fuelinjection.step1.model;

// 필수한 값이 필요하다면 추상 클래스를 통해 생성자를 구현하자!
public abstract class Car {

    abstract double getDistancePerLiter();

    abstract double getTripDistance();

    abstract String getName();

    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
