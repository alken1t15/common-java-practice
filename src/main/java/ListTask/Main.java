package ListTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private static final ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        boolean repeat = true;
        while (repeat) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("""
                        Выберите действие:
                        1. Добавить задачу
                        2. Вывести список задач
                        3. Удалить задачу
                        0. Выход""");
                String str = bufferedReader.readLine();
                switch (str) {
                    case "1" -> {
                        System.out.println("Введите задачу для планирования:");
                        String str2 = bufferedReader.readLine();
                        arrayList.add(str2);
                    }
                    case "2" -> {
                        System.out.println("Список задач:");
                        for (int i = 0; i < arrayList.size(); i++) {
                            System.out.println(i + 1 + ". " + arrayList.get(i));
                        }
                    }
                    case "3" -> {
                        if (arrayList.isEmpty()) {
                            System.out.println("Список задач пуст");
                            break;
                        }
                        System.out.println("Введите задачу для удаления:");
                        String str3 = bufferedReader.readLine();
                        arrayList.remove(Integer.parseInt(str3) - 1);
                    }
                    case "0" -> repeat = false;
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}