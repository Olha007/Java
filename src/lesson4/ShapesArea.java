package lesson4;

/**
 * 1. Напишіть клас ShapesArea із перевантаженими методами calcSquare, які обчислюють площу прямокутника,
 * площу квадрата та площу кола та виводять результат на екран.
 * 2. Створіть клас, який використовуватиме екземпляр класу ShapesArea та його методи.
 *
 * @version 1.1
 * @autor Olha Nozdriukhina
 */
public class ShapesArea {
    /**
     * Обчислює площу прямокутника за його сторонами.
     *
     * @param a Перша сторона прямокутника.
     * @param b Друга сторона прямокутника.
     */
    public void calcSquare(int a, int b) {
        int square = a * b;
        System.out.println("Area of the rectangle: " + square);
    }

    /**
     * Обчислює площу квадрата за його стороною.
     *
     * @param a Сторона квадрата.
     */
    public void calcSquare(int a) {
        int square = a * a;
        System.out.println("Square area: " + square);
    }

    /**
     * Обчислює площу кола за його радіусом.
     *
     * @param radius Радіус кола.
     */
    public void calcSquare(double radius) {
        double square = Math.PI * radius * radius;
        System.out.println("Area of a circle: " + square);
    }

}

/**
 * Клас для демонстрації роботи класу ShapesArea.
 */
class SpecimenShapesArea {
    public static void main(String[] args) {

        ShapesArea shapesArea = new ShapesArea();

        shapesArea.calcSquare(5, 10);

        shapesArea.calcSquare(4);

        shapesArea.calcSquare(3.4);

    }
}

