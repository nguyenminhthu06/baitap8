public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(Point centerPoint, double width, double length) {
        super(centerPoint);
        this.width = width;
        this.length = length;
    }

    @Override
    public double dienTich() {
        return width*length;
    }

    @Override
    public double chuVi() {
        return 2*(width + length);
    }

    @Override
    public String toString() {
        return "Rectangle: " + super.toString()
                +" Width: " + width
                +" Length: " + length
                + " Area : " + dienTich()
                + " Perimeter: " + chuVi();
    }
}
