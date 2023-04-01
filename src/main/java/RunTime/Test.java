package RunTime;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal cat = new Animal(){
            @Override
            public void eat(){
                System.out.println("Cat is eating...");
            }
        };
        cat.eat();
    }
}
