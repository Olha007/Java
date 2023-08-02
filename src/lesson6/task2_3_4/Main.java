package lesson6.task2_3_4;

/**
 * Клас Main з методом main, який створює два екземпляри класу MyInit і викликає метод printArray()
 * для виведення значень їхніх масивів до консолі.
 */

public class Main {
    public static void main(String[] args) {
        MyInit obj1 = new MyInit();
        MyInit obj2 = new MyInit();

        System.out.print("Array in obj1: ");
        obj1.printArray();

        System.out.print("Array in obj2: ");
        obj2.printArray();
    }
}
