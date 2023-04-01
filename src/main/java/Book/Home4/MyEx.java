package Book.Home4;

public class MyEx extends Exception{
    static void doRisky(String t) throws  MyEx{
        System.out.print("h");
        if("yes".equals(t)){
            System.out.print("a");
            throw new MyEx();
        }
        System.out.print("o");
    }
}

