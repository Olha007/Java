package lesson3;

import java.util.Scanner;

/**
 * 1. Напишіть програму, яка запитує у користувача число, зчитує його з клавіатури та зберігає у змінній int під назвою "number".
 * Потім друкує "One", "Two",... , "Nine", якщо змінна "number" дорівнює 1, 2,... , 9 та "Other", якщо number > 9 або number < 1, відповідно:
 * 	а) у першій реалізації програми використовуйте оператори if-else;
 * 	б) у другій реалізації програми використовуйте оператор switch у класичній формі;
 * 	в) у третій реалізації програми використовуйте оператор enhanced switch.
 * Версія: 1.3
 * Автор: Olha
 */

public class TaskFirst {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter number = " + number);

        if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else if (number == 3) {
            System.out.println("Three");
        } else if (number == 4) {
            System.out.println("Four");
        } else if (number == 5) {
            System.out.println("Five");
        } else if (number == 6) {
            System.out.println("Six");
        } else if (number == 7) {
            System.out.println("Seven");
        } else if (number == 8) {
            System.out.println("Eight");
        } else if (number == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("Other");
        }

        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Other");
                break;
        }

        switch (number) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            default -> System.out.println("Other");
        }
    }
}

