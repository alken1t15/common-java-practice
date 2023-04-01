package TestForNike2;

public class PetMain {
    public static void main(String[] args) {
        Animal a;

        Spider s = new Spider();
        s.walk();
        s.eat();

        Cat c = new Cat(4);
        c.walk();
        c.eat();

        Fish f = new Fish();
        f.setName("Гуппи");
        f.walk();
        f.eat();

    }
}