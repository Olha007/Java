package lesson7;

/**
 * 1. Додайте до пакету з класом Shape клас Circle, який є підкласом Shape.
 * 2. Додайте до класу Circle поле radius типу double та виконайте його інкасуляцію з доданням стандартних геттера та сеттера.
 * 3. Додайте до класу конструктор з аргументами color та radius.
 * 4. У класі Circle перевизначте метод calcArea(), який має повертати площу кола.
 * 5. У класі Circle перевизначте метод toString(). Він повинен повертати рядок, який містить назву фігури, колір і
 * радіус кола, наприклад: "This is Circle, color is: назва_кольору, radius is: значення_радіусу"
 * 6. Додайте до коду метода main класу Main, код, що створює об’єкт Circle і виводить на екран його назву, колір та радіус,
 * також додайте код виклику методу calcArea() і виведення площі кола на консоль.
 *
 * @version 1.1
 * @autor Olha Nozdriukhina
 */

/**
 * Клас, який представляє геометричний коло.
 */
public class Circle extends Shape {
    private double radius;
    double pi = Math.PI;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "This is Circle, color is: " + color + "\n" + "Radius is: " + radius;
    }
}
