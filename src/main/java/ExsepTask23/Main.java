package ExsepTask23;

public class Main {
    public static void main(String[] args) {
        try {
            throw new CoinLogicException();
        } catch (CoinLogicException e) {
            try {
                throw new CoinLogicException("гей",e);
            } catch (CoinLogicException ex) {
                throw new RuntimeException(ex);
            }
        }
    }



    public void whenAssertingEquality () {
        String expected = "3.1415";
        String actual = "3";

    }
}
