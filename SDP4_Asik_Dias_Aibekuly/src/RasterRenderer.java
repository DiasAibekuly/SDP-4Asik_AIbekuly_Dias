public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a Circle of radius " + radius + " as a pixelated Raster graphic.");
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Drawing a Square of side " + side + " using Raster pixels.");
    }
}
