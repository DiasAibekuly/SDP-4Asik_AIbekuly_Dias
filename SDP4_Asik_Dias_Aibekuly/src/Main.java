public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5.5f);
        System.out.println("--- Vector Rendering ---");
        circle.draw();

        Shape square = new Square(rasterRenderer, 10.0f);
        System.out.println("\n--- Raster Rendering ---");
        square.draw();

        System.out.println("\n--- Switching Implementation at Runtime ---");
        square.setRenderer(vectorRenderer);
        square.draw();
    }
}
