package ObjectStudy.RunTime2;

import java.util.ArrayList;

public class Test
{
    public static void main(String[] args) {
        Animal animal = new Animal();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animal.takeAnimal(animals);
    }
}
