package PatternTask.abstractFacroty;

public class Main {
    public static void main(String[] args) {
        DeviceFactory deviceFactory = getFactory("En");

        Mouse mouse = deviceFactory.getMouse();
        Keyboard keyboard = deviceFactory.getKeyboard();
        TouchPad touchPad = deviceFactory.getTouchPad();

        mouse.click();
        mouse.doubleClick();
        keyboard.println();
        keyboard.print();
        touchPad.track(5,2);
    }
    public static DeviceFactory getFactory(String name){
        switch (name){
            case "Ru":
                return new RuFactory();
            case "En":
                return new EnFactory();
            default:
                throw new RuntimeException("Нету такой фабрики");
        }
    }
}
