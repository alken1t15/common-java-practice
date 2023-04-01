package LettCode.Task14;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("([}}])"));
    }

/*    public static boolean isValid(String s) {
        char[] arr = s.toCharArray();
        int count= 0;
        for(int i = 0;i<arr.length;i++){
            if(i+1 == arr.length){
                break;
            }
            String b = String.valueOf(arr[i]) + arr[i+1];
            if(b.equals("()")){
                count++;
            } else if (b.equals("[]")) {
                count++;
            }
            else if (b.equals("{}")) {
                count++;
            }
        }
        if(count == arr.length/2){
            return true;
        }
        return false;
    }*/

/*    public static boolean isValid(String s) {
        int count = 0;
        ArrayList<Character> arrayList = new ArrayList<>();
        char[] arr = s.toCharArray();
        for(char str : arr){
            if(str==')' || str==']' || str=='}')
            arrayList.add(str);
        }
        for(int i = 0; i<arr.length;i++){
            if(count == arr.length){
                return true;
            }
            if(arr[i]=='('){
                if(arrayList.contains(')')) {
                    count+=2;
                }
                else {
                    return false;
                }
            }
           else if(arr[i]=='['){
                if(arrayList.contains(']')) {
                    count+=2;
                }
                else {
                    return false;
                }
            }
            else if(arr[i]=='{'){
                if(arrayList.contains('}')) {
                    count+=2;
                }
                else {
                    return false;
                }
            }
        }
        return false;
    }*/

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (char str : arr) {
            if (str == '(' || str == '[' || str == '{') {
                stack.push(str);
            } else if (str == ')') {
                if (!stack.empty()) {
                    char temp = stack.peek();
                    if (temp == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else if (str == '}') {
                if (!stack.empty()) {
                    char temp = stack.peek();
                    if (temp == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else if (str == ']') {
                if (!stack.empty()) {
                    char temp = stack.peek();
                    if (temp == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}