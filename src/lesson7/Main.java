package lesson7;

/**
 * 1. У методі main класу Main створіть масив об'єктів підкласів класу Shape: два прямокутники, два кола та два трикутники.
 * 2. Додайте код для перебору масиву фігур у циклі (використовуйте цикл for-each) та виводу на екран характеристик кожної
 * фігури (за допомогою методу “toString()”) та значення площі фігури (за допомогою методу “calcArea()”).
 * 3. Додайте код для обчислення сумарної площі всіх фігур масиву.
 * 4. Додайте код для обяислення сумарних площ для кожного типу фігури (використовуйте оператор instanceof для визначення
 * належності об'єкта до класу).
 * 5. Наведіть ще одну версію коду обчислення сумарних площ для кожного типу фігури з використанням покращеного switch з
 * pattern-matching.
 * *
 * * @version 1.1
 * * @autor Olha Nozdriukhina
 */

/**
 * Клас для демонстрації створення об'єктів фігур і розрахунку їх площ.
 */
public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape("red");
        System.out.println(shape);
        System.out.println();

        Circle circle = new Circle("pink", 3.3);
        System.out.println(circle);
        System.out.println("Square circle: " + circle.calcArea());
        System.out.println();

        Rectangle rectangle = new Rectangle("green", 4.1, 3.5);
        System.out.println(rectangle);
        System.out.println("Square rectangle: " + rectangle.calcArea());
        System.out.println();

        Triangle triangle = new Triangle("black", 2, 3.4, 5);
        System.out.println(triangle);
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
            System.out.println(shape1.toString());
            System.out.println("Square: " + shape1.calcArea());
            System.out.println();
            totalArea += shape1.calcArea();
            System.out.println("Total area of all shapes:: " + totalArea);
        }

    }
}
