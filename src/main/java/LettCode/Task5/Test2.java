package LettCode.Task5;


public class Test2 {
    public static void main(String[] args) {
        System.out.println(canConstruct("bg","efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int count =0;
        char[] arr = ransomNote.toCharArray();
        char[] arr2 = magazine.toCharArray();
        for(int i = 0; i< ransomNote.length();i++){
            for(int j = 0; j < magazine.length();j++){
                if(arr[i] == arr2[j]){
                    arr[i] = 0;
                    arr2[j] = 0;
                    count ++;
                    break;
                }
            }
        }
        return count == ransomNote.length();
    }
}
