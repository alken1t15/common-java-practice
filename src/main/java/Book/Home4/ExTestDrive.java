package Book.Home4;

public class ExTestDrive {
    public static void main(String[] args) {
        String test = "no";
        try {
            System.out.print("t");
            MyEx.doRisky(test);
        } catch (MyEx e ){
            System.out.print("a");
        }
        finally {
            System.out.print("w");
            System.out.println("s");
        }
    }
}
