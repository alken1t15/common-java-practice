package Book.Home6;

import java.io.*;

public class DungeonGame implements Serializable {
    public int x = 3;
    transient long y = 4;
    private short z = 5;
    int getX() {
        return x;
    }
    short getZ(){
        return z;
    }
    long getY(){
        return y;
    }
}
 class  DungeonTest {
    public static void main(String[] args) {
        DungeonGame d = new DungeonGame();
        try {
            System.out.println(d.getX()+d.getY()+d.getZ());
            //Создание и запись данных в файл
            FileOutputStream fos = new FileOutputStream("dg.ser");
            ObjectOutputStream oss = new ObjectOutputStream(fos);
            oss.writeObject(d);
            oss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            //Чтение данных из файла
            FileInputStream fis = new FileInputStream("dg.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            d = (DungeonGame) ois.readObject();
            System.out.println(d.getX()+d.getY()+d.getZ());
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
