package lesson2;

/**
 * 1. Отримайте значення цілочисельної змінної доданням значень дня, місяця та року дати Вашого народження.
 * 2. Напишіть програму, що:
 *    а) виконує приведення отриманого у п.1 значення цілочисельної змінної до типу short та виводить результат
 *    б) виконує приведення отриманого у п.1 значення цілочисельної змінної до типу byte та виводить результат
 *    в) виводить символ, код якого дорівнює значенню, отриманому у п.1.
 * Версія: 1.2
 * Автор: Olha
 */

public class FourthTask {
    /**
     * Головний метод програми, виконує приведення типів та виводить результати.
     * @param args Масив аргументів командного рядка.
     */
    public static void main(String[] args) {

        int day = 28;
        int month = 9;
        int year = 1994;

        int sum = day + month + year;
        System.out.println(" sum = " + sum);

        // Приведення суми до типу short
        short shortResult = (short) sum;
        System.out.println(" short result = " + shortResult);

        // Приведення суми до типу byte
        byte byteResult = (byte) sum;
        System.out.println(" byte result = " + byteResult);

        // Приведення суми до типу char
        char charResult = (char) sum;
        System.out.println(" char result = " + charResult);
    }
}
