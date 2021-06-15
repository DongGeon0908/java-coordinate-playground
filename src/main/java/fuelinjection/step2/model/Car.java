package fuelinjection.step2.model;

// 인터페이스는 생성자를 만들 수 없다! -> 인터페이스에서 생성자를 허용하면 여러 인터페이스를 동시에 구현할 수 있다는 문제가 발생
// 인터페이스에서는 public abstract가 꼭 필요~
public interface Car {

    public abstract String getName();

    public abstract double getChargeQuantity();
}
