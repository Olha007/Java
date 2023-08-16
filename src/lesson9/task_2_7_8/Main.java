package lesson9.task_2_7_8;

/**
 * Створіть клас Main, у методі main якого створіть об'єкти по два об'єкти качки та літака  та напишіть код, що
 * виводить значення їх властивостей на екран, значення хеш-коду та виконує перевірку їх на рівність.
 * <p>
 * * @version 1.1
 * * @autor Olha Nozdriukhina
 */

public class Main {
    public static void main(String[] args) {

        Duck duck1 = new Duck("Mallard ", "Wild ");
        //Duck duck2 = new Duck("Mallard ", "Wild ");
        Duck duck2 = new Duck("CherryValley ", "Domestic ");

        Plane plane1 = new Plane("Boeing 737 ", 15);
        Plane plane2 = new Plane("Airbus A320 ", 18);

        System.out.println("Duck1: " + duck1);
        System.out.println("Duck2: " + duck2);
        System.out.println("Plane1: " + plane1);
        System.out.println("Plane2: " + plane2);
        System.out.println();

        System.out.println("Hash code duck 1: " + duck1.hashCode());
        System.out.println("Hash code duck 2: " + duck2.hashCode());
        System.out.println("Hash code plane 1: " + plane1.hashCode());
        System.out.println("Hash code plane 2: " + plane2.hashCode());
        System.out.println();

        System.out.println("Duck 1 equals Duck 2: " + duck1.equals(duck2));
        System.out.println("Plane 1 equals Plane 2: " + plane1.equals(plane2));
    }
}
