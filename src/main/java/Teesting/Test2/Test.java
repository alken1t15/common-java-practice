package Teesting.Test2;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Animal() {
            public void eat() {
                System.out.println("Кошка кушает");
            }
        };
        Run dog = () -> System.out.println("Собака кушает");
        dog.run();
        cat.eat();
    }
}