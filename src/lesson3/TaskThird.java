package lesson3;

import java.util.Arrays;
import java.util.Random;

/**
 * Розробіть програму на мові Java, використовуючи умовні оператори if, else if, else, while або do-while
 * За допомогою генератора випадкових чисел, що генерує числа від 0 до 3000, задайте значення змінної,
 * що зберігає певний рік. Виведіть відповідний цьому року номер століття, враховуючи, що століття починається з 01 року,
 * а закінчується 00 роком (наприклад, початком 20 століття був 1901 рік, а кінцем - 2000 рік).
 */

public class TaskThird {
    public static void main(String[] args) {

        Random random = new Random();
        int year = random.nextInt(3001);

        System.out.println("Рік: " + year);

        int century;
        if (year >= 1 && year <= 100) {
            century = 1;
        } else if (year >= 101 && year <= 200) {
            century = 2;
        } else if (year >= 201 && year <= 300) {
            century = 3;
        } else {
            century = (year / 100) + 1;
        }
        System.out.println("Століття: " + century);

        do {
            year = random.nextInt(3001);
        } while (year == 0);

        century = (year - 1) / 100 + 1;

        System.out.println("Рік: " + year);
        System.out.println("Століття: " + century);

        System.out.println();


    }



}


