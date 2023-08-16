package lesson9.task2_8_2;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape("red") {
            @Override
            public double calcArea() {
                return 0;
            }

            @Override
            public void draw() {
                System.out.println(this + " - area: " + calcArea());
            }
        };
        shape.draw();
        System.out.println();

        Circle circle = new Circle("pink", 3.3);
        circle.draw();
        System.out.println("Square circle: " + circle.calcArea());
        System.out.println();

        Rectangle rectangle = new Rectangle("green", 4.1, 3.5);
        rectangle.draw();
        System.out.println("Square rectangle: " + rectangle.calcArea());
        System.out.println();

        Triangle triangle = new Triangle("black", 2, 3.4, 5);
        triangle.draw();
        System.out.println("Square triangle: " + triangle.calcArea());
        System.out.println();

        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle("white", 1);
        shapes[1] = new Circle("orange", 5.1);
        shapes[2] = new Rectangle("blue", 3, 2.5);
        shapes[3] = new Rectangle("yellow", 4.5, 3);
        shapes[4] = new Triangle("green", 4, 5, 7);
        shapes[5] = new Triangle("purple", 4, 3.5, 5.7);

        double totalArea = 0.0;

        // Перебір масиву фігур та вивід їх інформації та площ
        for (Shape shape1 : shapes) {
            shape1.draw();
            totalArea += shape1.calcArea();
        }
        System.out.println("Total area of all shapes: " + totalArea);
        System.out.println();

        double totalCircleArea = 0.0;
        double totalRectangleArea = 0.0;
        double totalTriangleArea = 0.0;

        // Перебір масиву фігур та вивід їх інформації та площ
        for (Shape shape1 : shapes) {
            shape1.draw();
            System.out.println();

            if (shape1 instanceof Circle c) {
                totalCircleArea += c.calcArea();
            } else if (shape1 instanceof Rectangle r) {
                totalRectangleArea += r.calcArea();
            } else if (shape1 instanceof Triangle t) {
                totalTriangleArea += t.calcArea();
            } else {
                throw new IllegalStateException("Unexpected value: " + shape1);
            }

            System.out.println("Total area of circles: " + totalCircleArea);
            System.out.println("Total area of rectangles: " + totalRectangleArea);
            System.out.println("Total area of triangles: " + totalTriangleArea);
        }
    }
}

