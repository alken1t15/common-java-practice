package LettCode.Task25;

public class Main {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }

    public static int firstUniqChar(String s) {
        char[] array = s.toCharArray();
        boolean proverka;
        for (int i = 0; i < array.length; i++) {
            char temp = array[i];
            proverka = true;
            for (int j = 0; j < array.length; j++) {
                if (temp == array[j] && i != j) {
                    proverka = false;
                    break;
                }
            }
            if (proverka) {
                return i;
            }
        }
        return -1;
    }
}
