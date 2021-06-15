package starbuzz;

import starbuzz.model.CaffeineBeverage;
import starbuzz.model.Coffee;
import starbuzz.model.Tea;

public class StarBuzz {
    public static void main(String[] args) {

        // Coffee는 CaffeubeBeverage이다. --> 업캐스팅
        CaffeineBeverage caffeineBeverage = new Coffee();

        // CaffeubeBeverage는 Coffee이다. --> 불가능..
        // Coffee coffee = new CaffeineBeverage();

        // Tea는 CaffeubeBeverage이다. --> 업캐스팅
        CaffeineBeverage caffeineBeverage1 = new Tea();

        // CaffeubeBeverage는 Tea이다. --> 불가능..
        // Tea tea = new CaffeineBeverage();

        // 다운 캐스팅
        CaffeineBeverage beverage = new Coffee();

        if (beverage instanceof Coffee) {
            Coffee coffee = (Coffee) beverage;
            Tea tea = (Tea) beverage;
        }

    }
}
