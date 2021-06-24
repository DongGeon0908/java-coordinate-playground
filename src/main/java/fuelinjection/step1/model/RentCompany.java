package fuelinjection.step1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {
    private final String SEPARATOR = " : ";
    private final String LITER = "리터";
    private final String NEWLINE = System.getProperty("line.separator");

    private final List<Car> cars = new ArrayList<>();

    // 생성자를 고를 수 있도록 만들기 위해서 메서드로 생성자를 만듬
    public static RentCompany create() {
        return new RentCompany();
    }

    /*
    public static RentCompany superCreate(){
        valiu~~~
        return new RentCompany();
    }
     */

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
