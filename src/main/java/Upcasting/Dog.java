package Upcasting;

public class Dog extends Pet {
    @Override
    public void introduce() {
        System.out.println("I'm Dog");
    }
}