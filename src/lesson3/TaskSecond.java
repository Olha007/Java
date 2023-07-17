package lesson3;

/**
 * 1. Напишіть програму, яка виводить на екран наступне:
 * <p>
 * 1
 * 2 1
 * 3 2 1
 * 4 3 2 1
 * 5 4 3 2 1
 * 6 5 4 3 2 1
 * 7 6 5 4 3 2 1
 * 8 7 6 5 4 3 2 1
 * <p>
 * Використовуйте вкладені оператори організації циклів (for).
 * Для виведення значень без переходу на новий рядок використовуйте оператор System.out.print(...).
 * * Версія: 1.4
 * * Автор: Olha
 */

public class TaskSecond {
    public static void main(String[] args) {

        outer:
        for (int i = 1; i <= 8; i++) {
            for (int j = i; j >= 1; j--) {
                if (j > 8) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}

