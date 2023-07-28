package lesson5;

import java.util.Scanner;

/**
 * 1. Створіть клас MyMath із двома статичними методами (findMin і findMax), які прийматимуть масив значень int як аргумент
 * і повертатимуть мінімальне значення елемента (для методу findMin) та максимальне значення елемента (для методу findMax).
 * 2. Створіть клас Calculation, який створить два масиви цілих чисел і використає статичні методи findMin і findMax класу MyMath.
 * 3. Додайте до класу MyMath константу PI = 3.14 і статичний метод areaOfCircle, який прийматиме радіус як параметр,
 * використовуватиме константу PI та обчислюватиме площу.
 * 4. Додайте до класу Calculation код, який використає метод areaOfCircle для довільного радіусу, що вводиться користувачем
 * з консолі.
 *
 * @version 1.0
 * @autor Olha Nozdriukhina
 */

/**
 * Клас MyMath зі статичними методами для обчислення площі кола та пошуку мінімального та максимального елементів у масиві.
 */
public class MyMath {

    static final double PI = 3.14;

    /**
     * Метод для обчислення площі кола.
     *
     * @param radius Радіус кола.
     * @return Площа кола.
     */
    public static double areaOfCircle(double radius) {
        double square = radius * radius * PI;
        return square;
    }

    /**
     * Метод для пошуку мінімального елемента в масиві.
     *
     * @param arr Масив, в якому треба знайти мінімальний елемент.
     * @return Мінімальний елемент масиву.
     * @throws IllegalArgumentException якщо масив порожній або має недостатньо елементів.
     */
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Масив має містити принаймні один елемент");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }

    /**
     * Метод для пошуку максимального елемента в масиві.
     *
     * @param arr Масив, в якому треба знайти максимальний елемент.
     * @return Максимальний елемент масиву.
     * @throws IllegalArgumentException якщо масив порожній або має недостатньо елементів.
     */
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Масив має містити принаймні один елемент");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    /**
     * Клас Calculation містить метод main для демонстрації роботи методів класу MyMath.
     */

    public static class Calculation {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть радіус кола: ");
            double radius = scanner.nextDouble();
            double arrea = MyMath.areaOfCircle(radius);

            System.out.println("Площа кола: " + arrea);

            int[] arr1 = {1, 4, 5, 8, 3, 9};
            int[] arr2 = {8, 55, 3, 2, 15, 2};

            int minArr1 = MyMath.findMin(arr1);
            int maxArr1 = MyMath.findMax(arr1);


            int minArr2 = MyMath.findMin(arr2);
            int maxArr2 = MyMath.findMax(arr2);


            System.out.println("Мінімальний елемент першого масиву: " + minArr1);
            System.out.println("Максимальний елемент першого масиву: " + maxArr1);

            System.out.println("Мінімальний елемент другого масиву: " + minArr2);
            System.out.println("Максимальний елемент другого масиву: " + maxArr2);
        }
    }
}
