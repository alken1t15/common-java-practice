package RunTime.Task2;

public class Test {
    public static void main(String[] args) {
        AbleToEat ableToEat = () -> System.out.println("Cat is eating...");
        ableToEat.eat();
    }
}
