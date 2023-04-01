package LettCode.Task28;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg",2));
    }
    public static String reverseStr(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder().append(s);
        for(int i = 0;i<k;i++){
            stringBuilder.append(s.charAt(i));
            if(i!=0) {
                stringBuilder2.deleteCharAt(i-1);
            }
            else {
                stringBuilder2.deleteCharAt(i);
            }
        }
        return String.valueOf(stringBuilder.reverse().append(stringBuilder2));
    }
}
