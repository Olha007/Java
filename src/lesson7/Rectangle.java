package lesson7;

/**
 * 1. Додайте до пакету з класом Shape клас Rectangle, який є підкласом Shape.
 * 2. Додайте до класу Rectangle поля length та width типу double та виконайте їх інкасуляцію з доданням стандартних геттерів та сеттерів.
 * 3. Додайте до класу конструктор з аргументами color, length та width.
 * 4. У класі Rectangle перевизначте метод calcArea(), який має повертати площу прямокутника.
 * 5. У класі Rectangle перевизначте метод toString(). Він повинен повертати рядок, який містить назву фігури, колір,
 * довжину та ширину, наприклад: "This is Rectangle, color is: назва_кольору, length is: значення_довжини, width is: значення_ширини"
 * 6. Додайте до коду метода main класу Main, код, що створює об’єкт Rectangle і виводить на екран його назву, колір,
 * довжину та ширину, також додайте код виклику методу calcArea() і виведення площі прямокутника на консоль.
 *
 * @version 1.1
 * @autor Olha Nozdriukhina
 */

/**
 * Клас, який представляє прямокутник.
 */
public class Rectangle extends Shape {
    double width;
    double length;

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

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double calcArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "This is Rectangle, color is: " + color + "\n" + "This is wight: " + width + "\n" + "This is length: " + length;
    }
}
