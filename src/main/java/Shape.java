public class Shape {
    protected Point centerPoint;
    private static int count = 0;

    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
        count++;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Center Point: " + centerPoint;
    }
}
