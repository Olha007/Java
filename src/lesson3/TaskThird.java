package lesson3;

import java.util.Random;

/**
 * За допомогою генератора випадкових чисел, що генерує числа від 0 до 3000, задайте значення змінної,
 * що зберігає певний рік. Виведіть відповідний цьому року номер століття, враховуючи, що століття починається
 * з 01 року, а закінчується 00 роком (наприклад, початком 20 століття був 1901 рік, а кінцем - 2000 рік).
 */

public class TaskThird {
    public static void main(String[] args) {

        Random random = new Random();
        int year = random.nextInt(3001);
        int century = (year / 100 ) + 1;

        System.out.println("Year " + year);
        System.out.println("Century " + century);
    }
}
