package lesson2;

/**
 * Клас ThirdTask оголошує змінні усіх примітивних типів з довільними значеннями.
 * Версія: 1.2
 * Автор: Olha
 */

public class FourthTask {
    public static void main(String[] args) {
        /**
         * Головний метод програми, виконує приведення типів та виводить результати.
         * @param args Масив аргументів командного рядка.
         */
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
