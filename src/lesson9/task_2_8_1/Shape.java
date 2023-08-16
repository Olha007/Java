package lesson9.task_2_8_1;

/**
 1. Додайте до проекту MyShapes інтерфейс Drawable з абстрактним методом void draw().
 2. Реалізуйте абстрактний метод інтерфейсу у класі Shape так, щоб він виводив на екран назву та характеристики
 кожної з фігур підкласів, а також площу цієї фігури, наприклад, так:
 This is Circle, color is: GREEN, radius=10.0 - area: 314.1592653589793
 3. Додайте до методу main класу Main код, що перебирає масив фігур у циклі (використовуйте цикл for-each) і
 викликає для кожної метод draw().
 * <p>
 * * @version 1.1
 * * @autor Olha Nozdriukhina
 */

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "color is: " + color;
    }
}

