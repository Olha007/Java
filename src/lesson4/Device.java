package lesson4;

/**
 * 1. Напишіть клас Computer, атрибутами цього класу є виробник (типу String), serialNumber (типу int), price (типу float),
 * quantityCPU (типу int) і frequencyCPU (типу int). Створіть два об'єкти цього класу з різними значеннями атрибутів.
 * 2. Поля комп’ютерного класу необзідно інкапсулювати. Додайте до класу Computer методи отримання та встановлення знчень полів.
 * 3. Напишіть програму для створення масиву об’єктів Computer (5 шт.).
 * 4. Напишіть програму, яка перебирає масив комп’ютерних об’єктів і збільшує значення у полі ціни на 10 відсотків.
 * 5. Додайте до класу Computer метод void view(), який друкує значення усіх полів об’єкта в рядку, і виведіть всю інформацію
 * (значення усіх полів) усіх об’єктів на екран.
 * <p>
 * Клас Device: Призначення: Головний клас програми, що містить метод main, де створюються об'єкти типу Computer
 * та проводяться розрахунки та виведення результатів.
 * Клас Computer: Призначення: Клас, що представляє комп'ютер та містить його характеристики, такі як виробник, серійний номер,
 * ціна, кількість процесорів та частота процесора. Також містить метод view,який виводить інформацію про комп'ютер.
 *
 * @version 1.0
 * @autor Olha Nozdriukhina
 */


public class Device {
    public static void main(String[] args) {

        Computer computer1 = new Computer("Germany", 1, 20.4F, 2, 4);
        Computer computer2 = new Computer("Polish", 2, 300.23F, 4, 6);

        Computer[] computers = new Computer[5];
        computers[0] = new Computer("Germany", 1, 20.4F, 2, 4);
        computers[1] = new Computer("USA", 3, 30.4F, 4, 4);
        computers[2] = new Computer("France", 2, 300.23F, 4, 6);
        computers[3] = new Computer("Ukraine", 4, 100.4F, 4, 5);
        computers[4] = new Computer("Spain", 5, 780.56F, 3, 8);


        double percentIncrease = 0.10;
        for (Computer computer : computers) {
            double currentPrice = computer.getPrice();
            double newPrice = currentPrice + (currentPrice * percentIncrease);
            computer.setPrice((float) newPrice);
        }

        for (int i = 0; i < computers.length; i++) {
            computers[i].view();
        }
    }
}
