package Book3.InterfaceTask;

import java.lang.annotation.Annotation;

public class Audi<K> extends Car implements Idrive<Audi> {

    private K key;

    public Audi(int price, String model) {
        super(price, model);
    }

    @Override
    public void drive(Audi car) {

    }
    public void GG(K key){
        System.out.println(key);
    }


}
