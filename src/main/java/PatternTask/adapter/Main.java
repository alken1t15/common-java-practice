package PatternTask.adapter;

public class Main {
    public static void main(String[] args) {
        VectorGraphicsInterface vectorGraphicsInterface = new AdapterVectorGraphics();
        vectorGraphicsInterface.drawLine();
        vectorGraphicsInterface.drawSquare();
    }
}
