package PatternTask.facrotyMethod;

public class DigitalFabricWatch implements FabricWatch{
    @Override
    public Watch create() {
        return new DigitalWatch();
    }
}
