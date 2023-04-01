package PatternTask.adapter;

public class AdapterVectorGraphics extends RasterGraphics implements VectorGraphicsInterface {

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
drawRasterSquare();
    }
}
