package PatternTask.facrotyMethod;

public class RimFabricWatch implements FabricWatch{
    @Override
    public Watch create() {
        return new RimWatch();
    }
}
