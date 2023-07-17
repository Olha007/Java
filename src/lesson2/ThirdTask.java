package lesson2;

/**
 * Клас ThirdTask оголошує змінні усіх примітивних типів з довільними значеннями.
 * Версія: 1.1
 * Автор: Olha
 */
public class ThirdTask {
    /** Оголошення змінних в методі різних примітивних типів з довільними значеннями */
    public static void main(String[] args) {
        byte byteVariable = 1;
        short shortVariable = 2;
        int integer = 10;
        double doubleVariable = 3.14;
        float floatVariable = 51F;
        long longVariable = 2L;
        boolean booleanVariable = true;
        boolean booleanVariable1 = false;
        char charVariable = 'B';

        System.out.println("Змінні примітивних типів: ");
        System.out.println("byteVariable : " + byteVariable + " (тип: byte)");
        System.out.println("shortVariable: " + shortVariable + " (тип: short)");
        System.out.println("integerVariable: " + integer + " (тип: int)");
        System.out.println("floatVariable: " + doubleVariable + " (тип: double)");
        System.out.println("doubleVariable: " + floatVariable + " (тип: float)");
        System.out.println("dlongVariable: " + longVariable + " (тип: long)");
        System.out.println("booleanVariable: " + booleanVariable + " (тип: boolean)");
        System.out.println("booleanVariable: " + booleanVariable1 + " (тип: boolean)");
        System.out.println("charVariable: " + charVariable + " (тип: char)");
    }

}
