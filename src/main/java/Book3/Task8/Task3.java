package Book3.Task8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\untitled\\res.txt"));
            String tmp = "";
            while ((tmp = br.readLine()) != null) {
                // пробел использовать как разделитель
                String[] s = tmp.split("\\s");
                // вывод полученных строк
                for (String res : s) {
                    System.out.println(res);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
