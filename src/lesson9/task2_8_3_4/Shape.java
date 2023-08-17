package lesson9.task2_8_3_4;

abstract class Shape implements Comparable<Shape> {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calcArea();

    public void draw() {
        System.out.println(this + " - area: " + calcArea());
    }

    @Override
    public String toString() {
        return "color is: " + color;
    }

    @Override
    public int compareTo(Shape other) {
        double thisArea = this.calcArea();
        double otherArea = other.calcArea();

        if (thisArea < otherArea) {
            return -1;
        } else if (thisArea > otherArea) {
            return 1;
        } else {
            return 0;
        }
    }
}

