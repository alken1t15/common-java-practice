package ObjectStudy.RunTime2;

import java.util.ArrayList;

public class Animal {
    public void  eat(){
        System.out.println("Животное кушает");
    }

    public void takeAnimal(ArrayList<Animal> animals){
        for(Animal animal : animals){
            animal.eat();
        }
    }
}
