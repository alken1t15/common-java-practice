package Book3.Task4;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Command
public class Car {
    private String model;
    private int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public void ShowInfo(){
        Annotation annotation = this.getClass().getAnnotation(Command.class);

        Command command = (Command) annotation;
        System.out.println(command.model());
        System.out.println(command.prise());
    }
    @Break
    public void brakeSmall(){
        for(Method m : this.getClass().getDeclaredMethods()){
            if(m.isAnnotationPresent(Break.class)){
                Break br = m.getAnnotation(Break.class);
                System.out.println(br.name());
                System.out.println(br.price());
                System.out.println(br.reiting());
            }
        }
    }

}
