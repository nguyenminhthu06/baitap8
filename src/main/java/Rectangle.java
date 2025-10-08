public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(Point centerPoint, double width, double length) {
        super(centerPoint);
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle: " + super.toString()
                +" Width: " + width
                +" Length: " + length;
    }
}
