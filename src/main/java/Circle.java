public class Circle extends Shape {
    private double radius;

    public Circle (Point centerPoint, double radius) {
        super(centerPoint);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle: " + super.toString()
                + " Radius: " + radius;
    }
}
