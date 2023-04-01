package LettCode.Task26;

public class Main {
    public static void main(String[] args) {
        System.out.println(findTheDifference("","y"));
    }

    public static char findTheDifference(String s, String t) {
        StringBuilder stringBuilder = new StringBuilder().append(s);
        StringBuilder stringBuilder2 = new StringBuilder().append(t);
        for(int i = 0;i<stringBuilder.length();i++){
            for(int j = 0;j<stringBuilder2.length();j++){
                if(stringBuilder.charAt(i)==stringBuilder2.charAt(j)){
                    stringBuilder.deleteCharAt(i);
                    stringBuilder2.deleteCharAt(j);
                    i--;
                    break;
                }
            }
        }
        if(!stringBuilder.isEmpty()){
            return stringBuilder.charAt(0);
        }
        else if(!stringBuilder2.isEmpty()){
            return stringBuilder2.charAt(0);
        }
        else {
            return '0';
        }
    }

}
