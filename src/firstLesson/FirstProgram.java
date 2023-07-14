package firstLesson;

/**
 * Клас FirstLesson.FirstProgram є початковою точкою входу у програму.
 * Він обчислює суму дня та місяця народження, переданих як аргументи командного рядка.
 *
 * @version 1.0
 * @autor Olha
 */
public class FirstProgram {
    /**
     * Метод main є головним методом програми.
     * Він приймає аргументи командного рядка та обчислює їх суму.
     */
    public static void main(String[] args) {

            int day = Integer.parseInt(args[0]); // День народження
            int month = Integer.parseInt(args[1]); // Місяць народження
            int sum = day + month; // Обчислення суми
            System.out.println("Sum: " + sum); // Виведення суми в консоль
        }
}


