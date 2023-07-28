package lesson5;

/**
 * 1. Напишіть клас Employee з полем name (String) та відповідним конструктором.
 * 2. Додайте до класу Employee метод calcSalary з varargs-аргументом salary (double). Цей метод повинен обчислити
 * загальну зарплату працівника та вивести на екран його ім’я та загальну зарплату.
 * 3. Напишіть клас Accountant, який буде створювати екземпляр Employee і використовуватиме його метод із різною
 * кількістю даних.творіть клас, який використовуватиме екземпляр класу ShapesArea та його методи.
 *
 * @version 1.1
 * @autor Olha Nozdriukhina
 */

/**
 * Класс Employee представляє співробітника компанії.
 */

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Обчислює загальну зарплату співробітника з урахуванням переданих зарплат.
     * Виводить на екран ім'я співробітника та загальну зарплату.
     *
     * @param salary Зарплати співробітника (може бути змінна кількість аргументів).
     */
    public void calcSalary(double... salary) {
        double totalSalary = 0;
        for (double s : salary) {
            totalSalary += s;
        }
        System.out.println("Name: " + name);
        System.out.println("Total salary: " + totalSalary);
    }
}

class Accountant {
    public static void main(String[] args) {

        Employee petr = new Employee("Petr");
        petr.calcSalary(200, 300, 1000);

        Employee marta = new Employee("Marta");
        marta.calcSalary(3000, 400);
    }
}
