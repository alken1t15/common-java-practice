package LettCode.Task21;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse(964632435));
    }
    public static int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder().append(x);
        try {
        if(stringBuilder.charAt(0)=='-' && stringBuilder.charAt(stringBuilder.length()-1)=='0'){
            return Integer.parseInt(stringBuilder.deleteCharAt(0).deleteCharAt(stringBuilder.length()-1).reverse().insert(0,"-").toString());
        }
        else if(stringBuilder.length()==1){
            return Integer.parseInt(stringBuilder.toString());
        }
       else if(stringBuilder.charAt(0)=='-'){
            return Integer.parseInt(stringBuilder.deleteCharAt(0).reverse().insert(0,"-").toString());
        }
        else if(stringBuilder.charAt(stringBuilder.length()-1)=='0'){
            return Integer.parseInt(stringBuilder.deleteCharAt(stringBuilder.length()-1).reverse().toString());
        }
        return Integer.parseInt(stringBuilder.reverse().toString());
        }catch (NumberFormatException e){
            return 0;
        }
    }
}
