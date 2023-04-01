package Project;

public class Player {
    String name;
    public Player (String name){
        this.name = name;
    }

    int number = 0;
    public void guess(){
        number = (int) (Math.random() * 10);
    }
}
