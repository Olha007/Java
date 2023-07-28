package lesson5;

/**
 * 1. Створіть клас Product з полями type (типу String (одяг, взуття,  шапки)), manufacturer (типу String), model
 * (типу String), price (типу double).
 * 2. Виконайте інкапсуляцію полів класу.
 * 3. Додайте параметризований конструктор, який ініціалізує усі поля об'єкту класу із  перевіркою відповідності
 * аргументу type наявним елементам масиву типів товарів, а аргументу price - обмеженню значень аргументу від >0 до <20000.
 * У разі невідповідності до обмежень, конструктор повинен завершити свою роботу без ініціалізації полів.
 * 4. Додайте до класу метод printProductInfo(), який буде виводити до консолі значення полів об'єктів класу.
 * 5. Створіть клас Main з методом main(String[] args), у якому створіть три об'єкти класу Product із різними значеннями
 * полів, у тому числі, які не проходять обмеження конструктора. Виведіть значення полів об'єктів на екран. Який буде
 * результат у разі не проходження обмежень аргументів?
 * 6. Виконайте рефакторинг конструктора: у разі невідповідності до обмежень він повинен генерувати виключення із
 * відповідним повідомленням.
 * 7. Виконайте необхідні зміни у методі main(String[] args) для обробки можливого виключення шляхом виведення повідомлення
 * та значення полів об'єктів на екран, а також для виведення значень полів об'єктів на екран у разі відсутності виключення.
 * 8. Запустіть програму на виконання для раніше створених об'єктів. Який буде результат у разі не проходження обмежень
 * аргументів?
 * 9. Зробіть конструктор з параметрами приватним та додайте до класу Product статичний метод Product getProduct(повний
 * списко параметрів), який перевіряє обмеження та викликає конструктор у разі відповідності аргументів обмеженням або
 * генерує виключення у разі невідповідності.
 * 10. Виконайте необхідні зміни у методі main(String[] args) для отримання об'єктів статичним фабричним методом із
 * обробкою можливого виключення шляхом виведення повідомлення та значень полів об'єктів на екран, а також  виведенням
 * значень полів об'єктів на екран у разі відсутності виключення.
 * <p>
 * * @version 1.1
 * * @autor Olha Nozdriukhina
 */

import java.lang.reflect.Type;

public class Product {
    String type;
    String manufacturer;
    String model;
    double price;

    String[] availableTypes = {"одяг", "взуття", "шапки" };

    public Product(String type, String manufacturer, String model, double price) {
        if (!isValidType(type)) {
            throw new IllegalArgumentException("Недійсний тип товару: " + type);
        }

        if (!isValidPrice(price)) {
            throw new IllegalArgumentException("Недійсна ціна товару: " + price);
        }
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }

    private boolean isValidType(String type) {
        for (String availableType : availableTypes) {
            if (availableType.equals(type)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidPrice(double price) {
        return price > 0 && price < 20000;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printProductInfo() {
        System.out.println("Type: " + type);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Product product1 = new Product("одяг", "Brand1", "Model1", 1500);
        Product product2 = new Product("взуття", "Brand 3", "Model21", 4000);
        Product product3 = new Product("шапки", "Brand5", "Model3", 2300);

        try {
            Product product4 = new Product("Shous", "Brand", "Model", 30000);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        product1.printProductInfo();
        System.out.println();
        product2.printProductInfo();
        System.out.println();
        product3.printProductInfo();
    }
}