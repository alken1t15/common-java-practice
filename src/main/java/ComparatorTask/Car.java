package ComparatorTask;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    private String model;
    private  int price;
    private  int yearBorn;

    public Car(String model, int price, int yearBorn) {
        this.model = model;
        this.price = price;
        this.yearBorn = yearBorn;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", yearBorn=" + yearBorn +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.price - o.price;
    }
}