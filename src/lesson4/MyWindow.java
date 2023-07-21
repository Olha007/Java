package lesson4;

/**
 * 1. Створіть клас “MyWindow” з полями (width (типу double), height (типу double), numberOfGlass (типу int), color (типу String), isOpen (boolean)).
 * 2. Створіть п’ять екземплярів класу MyWindow із різними значеннями полів.
 * 3. Додайте до класу MyWindow конструктор без параметрів, який буде ініціалізувати поля класу деякими значеннями за замовчуванням.
 * 4. Створіть екземпляр класу MyWindow за допомогою конструктора без параметрів.
 * 5. Додайте до класу MyWindow перевантажені конструктори, які ініціалізують поля класу, залежно від параметрів:
 * 	MyWindow (ширина, висота),
 * 	MyWindow (ширина, висота, кількість скла)...
 * 	По закінченні, клас MyWindow повинен мати чотири конструктори).
 * 6. Додайте до класу MyWindow метод “printFields”, який виводить на екран значення усіх полів.
 * 7. Напишіть клас з методом main, у якому створіть масив для п'яти об'єктів MyWindow і заповніть його,
 * створивши об’єкти MyWindow за допомогою різних конструкторів. Викличте метод “printFields” для кожного елемента масиву.
 *
 * @version 1.0
 * @autor Olha Nozdriukhina
 */

public class MyWindow {

    double width;
    double height;
    int numberOfGlass;
    String color;
    boolean isOpen;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public MyWindow() {
        this.width = 1;
        this.height = 5;
        this.numberOfGlass = 3;
        this.color = "green";
        this.isOpen = true;
    }

    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
    }

    public void printFields() {
        System.out.println("Wight - " + width);
        System.out.println("Height - " + height);
        System.out.println("NumberOfGlass - " + numberOfGlass);
        System.out.println("Color - " + color);
        System.out.println("IsOpen - " + isOpen);
    }

}

class Main {

    public static void main(String[] args) {

        MyWindow myWindow = new MyWindow(4, 5.5);
        MyWindow myWindow1 = new MyWindow(3.1, 3.3, 2, "blue", false);
        MyWindow myWindow2 = new MyWindow(1.1, 3.2, 3, "green", true);
        MyWindow myWindow3 = new MyWindow(4.4, 6.7, 4, "pink", false);
        MyWindow myWindow4 = new MyWindow();

        MyWindow myWindow5 = new MyWindow();

        MyWindow[] windows = new MyWindow[5];

        windows[0] = myWindow;
        windows[1] = myWindow1;
        windows[2] = myWindow2;
        windows[3] = myWindow3;
        windows[4] = myWindow4;


        for (MyWindow window : windows) {
            window.printFields();
        }
    }

}
