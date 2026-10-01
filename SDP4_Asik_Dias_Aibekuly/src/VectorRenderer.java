public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a Circle of radius " + radius + " as a smooth Vector graphic.");
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Drawing a Square of side " + side + " with sharp Vector lines.");
    }
}
