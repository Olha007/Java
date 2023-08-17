package lesson9.task2_8_3_4;

class Rectangle extends Shape {
    private final double width;
    private final double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double calcArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "This is Rectangle, color is: " + color + ", width=" + width + ", length=" + length;
    }
}
