package org.example.structuralPatterns.adapter;

public class VectorAdapterFromRaster2 implements VectorGraphicsInterface{
    RasterGraphics rasterGraphics = new RasterGraphics();
    @Override
    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}
