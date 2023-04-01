package PatternTask.abstractFacroty;

public class EnKeyboard implements Keyboard{
    @Override
    public void print() {
        System.out.println("Print the line");
    }

    @Override
    public void println() {
        System.out.println("Printing a line with a line feed");
    }
}
