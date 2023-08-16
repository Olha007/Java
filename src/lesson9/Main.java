package lesson9;

/**
 * 1. Створіть interface Flyable з методом void fly(), обмежте його успадкування тільки класами Vehicle та Animal.
 * 2. Створіть абстрактний клас Vehicle з інкапсульованим полем tonnage. Обмежте його використання довільним фінальним
 * та довільним незапечатаним класом.
 * 3. Напишіть код фінального та незапечатаного класу із реалізаціями абстрактних методів.
 * 4. Створіть абстрактний клас Animal з інкапсульованим полем feed. Обмежте його використання довільним запечатаним
 * та довільним незапечатаним класом із реалізаціями абстрактних методів.
 * 5. Напишіть код запечатаного та незапечатаного класу із реалізаціями абстрактних методів.
 * <p>
 * * @version 1.1
 * * @autor Olha Nozdriukhina
 */

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(76);
        Truck truck1 = new Truck(12);
        Cat cat = new Cat("Mice");
        Duck duck = new Duck("Grain");

        truck1.fly();
        car1.fly();
        cat.fly();
        duck.fly();

        System.out.println("A duck eats " + duck.getFeed());
        System.out.println("Car tonnage - " + car1.getTonnage());
    }
}







