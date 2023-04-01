package LettCode.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String store;

        {
            try {
                store = bufferedReader.readLine();
                int a = romanToInt(store);
                System.out.println(a);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static int romanToInt(String s) {
        char[] array = s.toCharArray();
        boolean temp = true;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i + 1 != array.length) {
                String word = (array[i]) + String.valueOf(array[i + 1]);
                switch (word) {
                    case "IV" -> {
                        count += 4;
                        array[i] = '\u0000';
                        array[i + 1] = '\u0000';
                        temp = false;
                    }
                    case "IX" -> {
                        count += 9;
                        array[i] = '\u0000';
                        array[i + 1] = '\u0000';
                        temp = false;
                    }
                    case "XL" -> {
                        count += 40;
                        array[i] = '\u0000';
                        array[i + 1] = '\u0000';
                        temp = false;
                    }
                    case "XC" -> {
                        count += 90;
                        array[i] = '\u0000';
                        array[i + 1] = '\u0000';
                        temp = false;
                    }
                    case "CD" -> {
                        count += 400;
                        array[i] = '\u0000';
                        array[i + 1] = '\u0000';
                        temp = false;
                    }
                    case "CM" -> {
                        count += 900;
                        array[i] = '\u0000';
                        array[i + 1] = '\u0000';
                        temp = false;
                    }
                    default -> temp = true;
                }
            }
            if (temp) {
                switch (array[i]) {
                    case 'I' -> count += 1;
                    case 'V' -> count += 5;
                    case 'X' -> count += 10;
                    case 'L' -> count += 50;
                    case 'C' -> count += 100;
                    case 'D' -> count += 500;
                    case 'M' -> count += 1000;
                }
            }
        }
        return count;
    }
}
