public class Circle extends Shape {
    private double radius;

    public Circle (Point centerPoint, double radius) {
        super(centerPoint);
        this.radius = radius;
    }

    @Override
    public double dienTich() {
        return 3.14 * radius * radius;
    }

    @Override
    public double chuVi() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "Circle: " + super.toString()
                + " Radius: " + radius
                + " Area: " + dienTich()
                + " Perimeter: " + chuVi();
    }
}
