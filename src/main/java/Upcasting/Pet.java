package Upcasting;

public class Pet extends Animal {
    @Override
    public void introduce() {
        System.out.println("I'm Pet");
    }
}