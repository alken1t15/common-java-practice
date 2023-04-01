package PatternTask.facrotyMethod;

public class Main {
    public static void main(String[] args) {
        FabricWatch fabricWatch = new RimFabricWatch();
        Watch watch = fabricWatch.create();
        watch.showTime();
    }
}
