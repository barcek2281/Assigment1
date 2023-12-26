import java.util.Random;

public class MyApplication {
    public static void main(String[] args) {
        Point[] points = generateRandomPoints(10);
        Shape shape = new Shape(points);

        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Longest Side: " + shape.longestSide());
        System.out.println("Average Side: " + shape.averageSide());
    }

    private static Point[] generateRandomPoints(int numPoints) {
        Point[] points = new Point[numPoints];
        Random rand = new Random();

        for (int i = 0; i < numPoints; i++) {
            double x = rand.nextDouble() * 10; // Random x coordinate (0 to 10)
            double y = rand.nextDouble() * 10; // Random y coordinate (0 to 10)
            points[i] = new Point(x, y);
        }

        return points;
    }
}
