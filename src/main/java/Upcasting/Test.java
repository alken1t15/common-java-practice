package Upcasting;

public class Test {
    public static void main(String[] args) {
        /*Animal animal =  new Pet();
        Animal animal1 = new WildAnima();
        Pet pet = new Dog();
        WildAnima wildAnima = new CoyOte();
        CoyOte coyOte = (CoyOte) wildAnima;

        animal.introduce();
        animal1.introduce();
        pet.introduce();
        wildAnima.introduce();
        coyOte.introduce();
        coyOte.run();

         */
        Pet pet = new Pet();
        Animal animal = pet;
        Pet pet2 = (Pet) animal;
        pet2.introduce();
    }
}