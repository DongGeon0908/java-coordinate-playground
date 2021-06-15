package fuelinjection.step1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {
    private final String SEPARATOR = " : ";
    private final String LITER = "리터";
    private final String NEWLINE = System.getProperty("line.separator");

    private final List<Car> cars = new ArrayList<>();

    // 생성자를 없애고 메서드로 RentComapny를 만드는게 팩토리 메서드인지 궁금합니다.
    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public String generateReport() {
        return cars
                .stream()
                .map(c -> c.getName() + SEPARATOR + (int) c.getChargeQuantity() + LITER)
                .collect(Collectors.joining(NEWLINE));
    }


}
