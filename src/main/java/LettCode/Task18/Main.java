package LettCode.Task18;

public class Main {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord2("luffy is still joyboy"));
    }
    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        String str2 = str[str.length-1].trim();
        return str2.length();
    }

    public static int lengthOfLastWord2(String s) {
        if(s.length()==0){
            return 1;
        }
        int temp = 0;
        int temp2 = 0;
        for(int i = s.length()-1; i>-1;i--){
            if(s.charAt(i)!=' '){
                if(temp==0){
                    temp =i+1;
                }
                else {
                    temp2=i;
                }
            } else if (temp!=0 && s.charAt(i)==' ') {
                temp2=i+1;
                break;
            }
        }
        return s.substring(temp2, temp).length();
    }
}
