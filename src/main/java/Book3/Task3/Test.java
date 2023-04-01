package Book3.Task3;

import java.lang.annotation.Annotation;

public class Test {
    public static void main(String[] args) {
        Car car = new Car(54,"greg");
        car.Show();

        CarTask annotation = car.getClass().getAnnotation(CarTask.class);
        CarTask carTask = annotation;
        System.out.println(carTask.model());
        System.out.println(carTask.price());


    }
}