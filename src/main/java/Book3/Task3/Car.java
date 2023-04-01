package Book3.Task3;
@CarTask( model = "BMV", price = 460)
public class Car {
    private  int price;
    private String model;

    public Car(int price, String model) {
        this.price = price;
        this.model = model;
    }

    public void Show(){
        System.out.println(price);
        System.out.println(model);
    }
}
