public class Shape {
    private Point[] points;

    public Shape(Point[] points) {
        this.points = points;
    }

    public double perimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.length - 1; i++) {
            perimeter += points[i].distanceTo(points[i + 1]);
        }
        perimeter += points[points.length - 1].distanceTo(points[0]);
        return perimeter;
    }

    public double longestSide() {
        double longest = 0;
        for (int i = 0; i < points.length - 1; i++) {
            double sideLength = points[i].distanceTo(points[i + 1]);
            if (sideLength > longest) {
                longest = sideLength;
            }
        }
        longest = Math.max(longest, points[points.length - 1].distanceTo(points[0]));
        return longest;
    }

    public double averageSide() {
        double totalLength = 0;
        for (int i = 0; i < points.length - 1; i++) {
            totalLength += points[i].distanceTo(points[i + 1]);
        }
        totalLength += points[points.length - 1].distanceTo(points[0]);
        return totalLength / points.length;
    }
}
