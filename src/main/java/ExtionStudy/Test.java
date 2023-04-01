package ExtionStudy;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик");
        dog.putCollar();
        dog.putMuzzle();
        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Проверяем снарежение! Ошейник надет?" + dog.isCollarPutOn + "\nповодок надет? " + dog.isLeashPutOn + "\nнамордник надет?" + dog.isMuzzlePutOn);
        }
    }
}
