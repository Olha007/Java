package lesson9.task2_8_3_4;

/**
 * 1. Відкрийте проект MyShapes з завдання 2.8.4.
 * 2. Додайте до класу Shape статичний метод під назвою parseShape(String), який повертає новий об’єкт-спадкоємець Shape на основі рядка, переданого як аргумент.
 * Приклади можливих рядків:
 * "Прямокутник:ЧЕРВОНИЙ:10,20";
 * "Трикутник:ЗЕЛЕНИЙ:9,7,12";
 * "Коло:ЧОРНЕ:10".
 * 3. У методі parseShape() ви повинні виконати такі дії (використовуйте оператор switch):
 * - визначити тип фігури на основі першої частини рядка;
 * - визначити колір фігури на основі другої частини рядка;
 * - визначити та отримати числові значення з третьої частини рядка та використати їх як аргументи для створення об’єкта відповідної фігури.
 * 4. Додайте до методу main класу Main код, що створює один прямокутник, один трикутник і одне коло за допомогою методу parseShape(String).
 */
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

    public static Shape parseShape(String input) {
        String[] parts = input.split(":");

        if (parts.length < 3) {
            throw new IllegalArgumentException("Invalid input format ");
        }

        String shapeType = parts[0];
        String color = parts[1];

        String[] dimensionsStr = parts[2].split(",");
        double[] dimensions = new double[dimensionsStr.length];
        for (int i = 0; i < dimensionsStr.length; i++) {
            dimensions[i] = Double.parseDouble(dimensionsStr[i].trim());  // Додайте .trim() для видалення пробілів
        }

        switch (shapeType) {
            case "Прямокутник":
                if (dimensions.length != 2) {
                    throw new IllegalArgumentException("Invalid dimensions for Прямокутник (Rectangle) ");
                }
                return new Rectangle(color, dimensions[0], dimensions[1]);
            case "Трикутник":
                if (dimensions.length != 3) {
                    throw new IllegalArgumentException("Invalid dimensions for Трикутник (Triangle) ");
                }
                return new Triangle(color, dimensions[0], dimensions[1], dimensions[2]);
            case "Коло":
                if (dimensions.length != 1) {
                    throw new IllegalArgumentException("Invalid dimensions for Коло (Circle) ");
                }
                return new Circle(color, dimensions[0]);
            default:
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }
}