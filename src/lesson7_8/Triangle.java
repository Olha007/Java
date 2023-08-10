package lesson7_8;

/**
 * 1. Додайте до пакету з класом Shape клас Triangle, який є підкласом Shape.
 * 2. Додайте до класу Triangle поля sideA та sideB та sideC типу double та виконайте їх інкасулцію з доданням стандартних геттерів та сеттерів.
 * 3. Додайте до класу конструктор з аргументами color, sideA, sideB та sideC.
 * 4. У класі Triangle перевизначте метод calcArea(), який має повертати площу трикутника, розраховану через довжини сторін (
 * за формулою Герона).
 * 5. У класі Triangle перевизначте метод toString(). Він повинен повертати рядок, який містить назву фігури, колір та значення
 * сторін, наприклад: "This is Triangle, color is: назва_кольору, sideA is: значення_сторони_A, sideB is: значення_сторони_B,
 * sideC is: значення_сторони_C"
 * 6. Додайте до коду метода main класу Main, код, що створює об’єкт Triangle і виводить на екран його назву, колір та сторони,
 * також додайте код виклику методу calcArea() і виведення площі трикутника на консоль.
 *
 * @version 1.1
 * @autor Olha Nozdriukhina
 */

/**
 * Клас, який представляє геометричну фігуру трикутник.
 */
public class Triangle extends Shape {
    double sideA;
    double sideB;
    double sideC;

    public Triangle(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private double semiPerimeter() {
        return (sideA + sideB + sideC) / 2;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double calcArea() {
        double p = semiPerimeter();
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public String toString() {
        return "This is Triangle, color is: " + color + "\n" + "sideA is: " + sideA + "\n" + "sideB is: " + sideB + "\n" + "sideC is: " + sideC;
    }
}
