package Teesting;

public class Car {
    private String model;
    private int price;
    private int topPrice;

    public Car(String model, int price, int topPrice) {
        this.model = model;
        this.price = price;
        this.topPrice = topPrice;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTopPrice() {
        return topPrice;
    }

    public void setTopPrice(int topPrice) {
        this.topPrice = topPrice;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (getPrice() != car.getPrice()) return false;
        if (getTopPrice() != car.getTopPrice()) return false;

        return model != null ? model.equals(car.model) : car.model == null;
    }

    public int hashCode() {
        int count = model != null ? model.hashCode() : 0;
        count = 31 * count + price;
        count = 31 * count + topPrice;
        return count;
    }
}