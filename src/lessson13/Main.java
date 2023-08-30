package lessson13;

import java.util.Arrays;

/**
 * 1. Відкрийте проект MyShapes. (з завдання 2.10.1). Створіть клас InvalidShapeStringException, який є підкласом Exception,
 * із конструктором без параметрів, який передає до конструктора суперкласу повідомлення про помилку у рядку-опису фігури.
 * 3. Перепишіть метод “parseShape(String)” у класі “Shape”, щоб викликати InvalidShapeStringException, якщо рядок, переданий
 * як аргумент методу, є недійсним.
 * Приклад правильного рядка:
 * "Прямокутник:ЧЕРВОНИЙ:10,20";
 * Приклад недійсних рядків:
 * "ПрямокутникЧЕРВОНИЙ12”";
 * "sdzgdzhgd";
 * 4. Додайте код до методу main() у класі Main, який створює один прямокутник, один трикутник і одне коло за допомогою
 * методу Shape.parseShape(String) і обробляє (за допомогою try-catch) виключення, якщо вони виникають (з виведенням
 * повідомлення про помилку на консоль).
 * <p>
 * * @version 1.1
 * * @autor Olha Nozdriukhina
 */

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
        Rectangle rectangle1 = new Rectangle("purple", 6, 4);

        if (rectangle.calcArea() > rectangle1.calcArea()) {
            System.out.println("The first rectangle is larger.");
        } else if (rectangle.calcArea() < rectangle1.calcArea()) {
            System.out.println("The second rectangle is larger.");
        } else {
            System.out.println("Both rectangles have the same area.");
        }
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

        Arrays.sort(shapes);

        System.out.println("Sorted shapes by area: ");
        for (Shape shape1 : shapes) {
            shape1.draw();
        }
        System.out.println();

        ShapeAreaComparator areaComparator = new ShapeAreaComparator();
        // Сортування масиву фігур за спаданням площ за допомогою компаратора
        Arrays.sort(shapes, areaComparator.reversed());

        System.out.println("Sorted shapes by area (descending): ");
        for (Shape shape1 : shapes) {
            shape1.draw();
        }
        System.out.println();

        String rectangleString = "Прямокутник:ЖОВТИЙ: 5.8,7";
        String triangleString = "Трикутник:СИНІЙ: 6,8,10";
        String circleString = "Коло:ЧЕРВОНЕ: ";

        try {
            Shape parsedRectangle = Shape.parseShape(rectangleString);
            Shape parsedTriangle = Shape.parseShape(triangleString);
            Shape parsedCircle = Shape.parseShape(circleString);

            System.out.println("Parsed Rectangle: ");
            parsedRectangle.draw();
            System.out.println();

            System.out.println("Parsed Triangle: ");
            parsedTriangle.draw();
            System.out.println();

            System.out.println("Parsed Circle: ");
            parsedCircle.draw();
        } catch (InvalidShapeStringException e) {
            System.out.println("Error while parsing shape: " + e.getMessage());
        }
    }
}
