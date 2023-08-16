package lesson9.task_2_7_8;

/**
 * 1. Створіть інтерфейс Floatable з методом void float().
 * 2. Створіть Java-запис Duck з полями species та  breed, який імплементує Floatable виведенням на екран інформації, що це качка.
 * 3. Створіть Java-запис Plane з полями model та  passengerNumber, який імплементує Floatable виведенням на екран інформації,
 * що це літак.
 * <p>
 * * @version 1.1
 * * @autor Olha Nozdriukhina
 */

public interface Floatable {
    void floatAction();
}

record Duck(String species, String breed) implements Floatable {

    @Override
    public void floatAction() {
        System.out.println("This is a duck ");
    }
}

record Plane(String model, int passengerNumber) implements Floatable {

    @Override
    public void floatAction() {
        System.out.println("This is a plane ");
    }
}



