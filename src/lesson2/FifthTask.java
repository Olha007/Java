package lesson2;

/**
 * 1. Розробіть програму, яка обчислює значення арифметичного виразу:
 *    (a + b)^2 / (a^2 + 3b^2),
 *    де short a = рік Вашого народження, short b = добуток дня та місяця Вашого народження.
 *    Уникайте використання методу Math.pow().
 * 2. Обчислення слід організувати двічі:
 *    а) без використання проміжних змінних - відразу з виведенням на екран результату;
 *    б) з використанням проміжних змінних для чисельника і знаменника, тип даних яких обирайте мінімально можливим (за кількістю відведених біт), щоб вмістилося значення.
 *    в) обирайте мінімально можливий (за кількістю відведених біт) тип і для кінцевого результату.
 *    г) програма повинна виводити на екран проміжні результати та кінцевий результат.
 * 3. Повторіть обчислення, зазначені у п. 2а), обравши для кінцевого результату тип даних float. Виведіть кінцевий результат на екран.
 * 4. Повторіть обчислення, зазначені у п. 2а), обравши для кінцевого результату тип даних double. Виведіть кінцевий результат на екран.
 * @version 1.2
 * @autor Olha
 */

public class FifthTask {
    public static void main(String[] args) {

        short a = 1994;
        short b = 28 * 9;

        int result;
        result = ((a * a) + (2 * a * b) + (b * b)) / ((a * a) + 3 * (b * b));
        System.out.println("result = " + result);

        int numerator = ((a * a) + (2 * a * b) + (b * b));
        System.out.println("\nnumerator = " + numerator);
        int denominator = ((a * a) + 3 * (b * b));
        System.out.println("denominator = " + denominator);
        int result1 = (int) numerator / denominator;
        System.out.println("result = " + result1);


        float resultF = (float) numerator / denominator;
        System.out.println("\nresultFloat =" + resultF);

        double resultD = (double) numerator / denominator;
        System.out.println("\nresultDouble =" + resultD);
    }
}
