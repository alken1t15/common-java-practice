package PatternTask.abstractFacroty;

public class EnMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Mouse click");
    }

    @Override
    public void doubleClick() {
        System.out.println("Double click");
    }
}
