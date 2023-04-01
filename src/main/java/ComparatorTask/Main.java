package ComparatorTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
 public static List<Car> carArrayList = new ArrayList<>();

    public static void main(String[] args) {
        Car car = new Car("BMV",200000,1937);
        Car car2 = new Car("Mercedes",400000,1987);
        Car car3 = new Car("Audi",350000,1988);
        Car car4 = new Car("BMV",800000,2000);

        carArrayList.add(car);
        carArrayList.add(car2);
        carArrayList.add(car3);
        carArrayList.add(car4);

        Collections.sort(carArrayList);

        for(Car car1:carArrayList){
            System.out.println(car1);
        }
    }
}
