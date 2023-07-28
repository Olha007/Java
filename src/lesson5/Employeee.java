package lesson5;

/**
 * 1. Створіть клас Employee з полями firstName, lastName, occupation, phone та статичне поле numberOfEmployees разом з відповідними геттерами та сеттерами. Також у класі повинен бути конструктор, який ініціалізує поля класу та збільшує кількість співробітників.
 * 2. Напишіть клас Main з методом main, у якому який створить три об'єкти Employee та виведіть кількість сівробітників із класу.
 *
 * @version 1.0
 * @autor Olha Nozdriukhina
 */

/**
 * Клас, що представляє співробітника з полями: firstName, lastName, occupation, phone.
 * Також містить статичне поле numberOfEmployees, що відстежує кількість створених співробітників.
 */

public class Employeee {
    String firstName;
    String lastName;
    String occupation;
    String phone;
    static int numberOfEmployees = 0;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getPhone() {
        return phone;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public Employeee(String firstName, String lastName, String occupation, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.phone = phone;
        numberOfEmployees++;
    }

    public void showInfo() {
        System.out.println("First name:" + firstName + " , " + "Last name:" + lastName + " , " + "Occupation:" + occupation + " , " + "Phone number:" + phone);
    }

}

/**
 * Основний клас програми, що демонструє використання класу Employeee для створення співробітників
 * та виведення інформації про них на консоль.
 */

class main {
    public static void main(String[] args) {

        Employeee employeee1 = new Employeee("John", "Doe", "Engineer", "+123456789");
        Employeee employeee2 = new Employeee("Jane", "Li", "Designer", "+123495859");
        Employeee employeee3 = new Employeee("Hose", "Lirk", "PM", "+1234958895");

        employeee1.showInfo();
        employeee2.showInfo();
        employeee3.showInfo();

        int totalEmployee = Employeee.numberOfEmployees;
        System.out.println("Кількість співробітників: " + totalEmployee);
    }
}