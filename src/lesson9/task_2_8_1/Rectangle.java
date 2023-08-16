package lesson9.task_2_8_1;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double calcArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString() + "\nThis is Rectangle\nWidth is: " + width + "\nLength is: " + length;
    }
}
