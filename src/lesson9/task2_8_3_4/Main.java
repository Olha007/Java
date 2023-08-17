package lesson9.task2_8_3_4;

import java.util.Arrays;

/**
 * 1. Реалізуйте абстрактним класом Shape інтерфейс Comparable так, щоб він порівнював фігури за значенням їх площ.
 * 2. Створіть ще один прямокутник з іншими розмірами та виведіть на екран результати порівняння двох прямокутників.
 * 3. Виконайте сортування фігур у масиві за зростанням значення їх площ. Виведіть на екран елементи отсортованого масиву.
 * 4. Додайте до проекту MyShapes об'єкт класу ShapeAreaDescComparator, який реалізує інтерфейс Comparator та дозволяє сортувати масив фігур за зменшенням значення їх площ.
 * 5. Відсортуйте масив з таким компаратором та виведіть на екран елементи відсортованого масиву.
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

        System.out.println("Sorted shapes by area:");
        for (Shape shape1 : shapes) {
            shape1.draw();
        }
        System.out.println();

        ShapeAreaComparator areaComparator = new ShapeAreaComparator();
        // Сортування масиву фігур за спаданням площ за допомогою компаратора
        Arrays.sort(shapes, areaComparator.reversed());

        System.out.println("Sorted shapes by area (descending):");
        for (Shape shape1 : shapes) {
            shape1.draw();
        }
    }
}
