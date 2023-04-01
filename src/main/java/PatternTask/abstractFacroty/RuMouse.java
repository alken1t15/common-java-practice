package PatternTask.abstractFacroty;

public class RuMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Щелчок мыши");
    }

    @Override
    public void doubleClick() {
        System.out.println("Двойной щелчок мыши");
    }
}
