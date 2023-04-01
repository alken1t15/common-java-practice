package ytrhfg;

public class LuxCar {
    private String model;
    private int price;
    private int superPrice;

    public LuxCar(String model, int price, int superPrice) {
        this.model = model;
        this.price = price;
        this.superPrice = superPrice;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        LuxCar luxCar = (LuxCar) obj;

        if (price != luxCar.price) return false;
        if (superPrice != luxCar.superPrice) return false;
        return model != null ? model.equals(luxCar.model) : luxCar.model == null;
    }

    public int hashCode() {
        int count = model != null ? model.hashCode() : 0;
        count = 31 * price + count;
        count = 31 * superPrice + count;
        return count;
    }
}