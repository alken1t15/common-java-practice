package TaskStudy1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        while (true) {
            System.out.println("""
                    Выберите действие:
                    1. Добавить задачу
                    2. Вывести список задач
                    3. Удалить задачу
                    0. Выход""");
            Scanner scanner = new Scanner(System.in);
            int action = scanner.nextInt();
            switch (action) {
                case (1):
                    System.out.println("Введите задачу для планирования:");
                    Scanner scanner1 = new Scanner(System.in);
                    list.add(scanner1.nextLine());
                    break;
                case (2):
                    System.out.println("Список задач:" + list);
                    break;
                case (3):
                    Scanner scanner2 = new Scanner(System.in);
                    int action2 = scanner2.nextInt();
                    list.remove(action2 - 1);
                    System.out.println(list);
                    break;
                case (0):
                    return;
            }
        }
    }
}