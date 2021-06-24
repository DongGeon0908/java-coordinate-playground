package fuelinjection.step2.model;

// 인터페이스는 생성자를 만들 수 없다! -> 인터페이스에서 생성자를 허용하면 여러 인터페이스를 동시에 구현할 수 있다는 문제가 발생
// 인터페이스에서는 public abstract가 꼭 필요~
public interface Car {


    String getName();


    double getChargeQuantity();
    /*
    double getDistancePerLiter();
    double getTripDistance();
    default double getChargeQuantity() { // 템플릿 메서드 패턴 -> 값은 다르지만, 공통적인 계산이나, 행동을 취할 경우 사용하기 -> 필요한 이유에 대해 명확하게 설명할 수 있어야함!!
        return getTripDistance() / getDistancePerLiter();
    }
     */
}
