package LettCode.Task19;

public class Main {
    public static void main(String[] args) {
        String input = "11";
        String result = convertStringToBinary(input);
        System.out.println(result);
       // addBinary("11",  "1");
    }
    public static String addBinary(String a, String b) {
/*        byte c = Byte.parseByte(a);
        byte e = Byte.parseByte(b);
        int q = c+e;*/
        String r = Integer.toBinaryString(Integer.parseInt(b));
        System.out.println(r);
        return null;
    }


    public static String convertStringToBinary(String input) {

        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            result.append(
                    String.format("%8s", Integer.toBinaryString(aChar))   // char -> int, auto-cast
                            .replaceAll(" ", "0")                         // zero pads
            );
        }
        return result.toString();

    }
}
