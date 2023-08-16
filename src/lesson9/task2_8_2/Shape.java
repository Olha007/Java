package lesson9.task2_8_2;

/**
 * 1. Відкрийте проект MyShapes (з завдання 2.7.1). Перепишіть клас Shape, зробивши його та його метод calcArea() абстрактним.
 * 2. Відкорегуйте метод toString() у класі Shape так, щоб він повертав тільки колір фігури: "color is: назва_кольору".
 * 3. Відредагуйте методи підкласів для правильної роботи програми.
 * 4. Запустіть програму.
 * <p>
 * * @version 1.1
 * * @autor Olha Nozdriukhina
 */

interface Drawable {
    void draw();
}
public abstract class Shape implements Drawable {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calcArea();

    @Override
    public void draw() {
        System.out.println(this + " - area: " + calcArea());
    }

    @Override
    public String toString() {
        return "color is: " + color;
    }
}

