package LettCode.Task31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"aadsdfghjkla","qwertyuiadfopq","zxadfazm","asadfaedfghjkala","qadfzwertyuiopq","zxcvbnzzm"};
        System.out.println(Arrays.toString(findWords(arr)));
    }

    public  static String[] findWords(String[] words) {
        ArrayList<String> arrayList = new ArrayList<>();
        HashSet<Character> hashSetFirst = new HashSet<>();
        HashSet<Character> hashSetSecond = new HashSet<>();
        HashSet<Character> hashSetThird = new HashSet<>();
        //1
        hashSetFirst.add('Q');
        hashSetFirst.add('W');
        hashSetFirst.add('E');
        hashSetFirst.add('R');
        hashSetFirst.add('T');
        hashSetFirst.add('Y');
        hashSetFirst.add('U');
        hashSetFirst.add('I');
        hashSetFirst.add('O');
        hashSetFirst.add('P');
        //1
        hashSetFirst.add('q');
        hashSetFirst.add('w');
        hashSetFirst.add('e');
        hashSetFirst.add('r');
        hashSetFirst.add('t');
        hashSetFirst.add('y');
        hashSetFirst.add('u');
        hashSetFirst.add('i');
        hashSetFirst.add('o');
        hashSetFirst.add('p');
        //2
        hashSetSecond.add('A');
        hashSetSecond.add('S');
        hashSetSecond.add('D');
        hashSetSecond.add('F');
        hashSetSecond.add('G');
        hashSetSecond.add('H');
        hashSetSecond.add('J');
        hashSetSecond.add('K');
        hashSetSecond.add('L');
        //2
        hashSetSecond.add('a');
        hashSetSecond.add('s');
        hashSetSecond.add('d');
        hashSetSecond.add('f');
        hashSetSecond.add('g');
        hashSetSecond.add('h');
        hashSetSecond.add('j');
        hashSetSecond.add('k');
        hashSetSecond.add('l');
        //3
        hashSetThird.add('Z');
        hashSetThird.add('X');
        hashSetThird.add('C');
        hashSetThird.add('V');
        hashSetThird.add('B');
        hashSetThird.add('N');
        hashSetThird.add('M');
        //3
        hashSetThird.add('z');
        hashSetThird.add('x');
        hashSetThird.add('c');
        hashSetThird.add('v');
        hashSetThird.add('b');
        hashSetThird.add('n');
        hashSetThird.add('m');
        boolean first= false;
        boolean second= false;
        boolean third = false;
        for (String s : words) {
            char[] word = s.toCharArray();
            for (int j = 0; j < word.length; j++) {
                if (first) {
                    if (!hashSetFirst.contains(word[j])) {
                        first = false;
                        break;
                    }
                } else if (second) {
                    if (!hashSetSecond.contains(word[j])) {
                        second = false;
                        break;
                    }
                } else if (third) {
                    if (!hashSetThird.contains(word[j])) {
                        third = false;
                        break;
                    }
                }
                if (hashSetFirst.contains((word[0]))) {
                    first = true;
                } else if (hashSetSecond.contains((word[0]))) {
                    second = true;
                } else if (hashSetThird.contains((word[0]))) {
                    third = true;
                }
                if (j == word.length - 1) {
                    arrayList.add(s);
                    first = false;
                    second = false;
                    third = false;
                }
            }
        }
        String[] str = new String[arrayList.size()];
        for(int i = 0;i<arrayList.size();i++){
            str[i]= arrayList.get(i);
        }
        return str;
    }
}
